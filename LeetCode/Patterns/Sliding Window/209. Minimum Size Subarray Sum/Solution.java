class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int l = 0, r = 0, sum = 0;
        while( r < nums.length ){
            sum += nums[r];
            r++;
            while (sum >= target) {
                min = Math.min(min, r - l);
                sum -= nums[l];
                l++;
            }
        }
        return  min == Integer.MAX_VALUE ? 0 : min;
    }
}