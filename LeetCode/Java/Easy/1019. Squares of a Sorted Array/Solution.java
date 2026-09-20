class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int l = 0, r = n - 1;
        int idx = n - 1;
        while ( l <= r ){
            int lsq = nums[l] * nums[l];
            int rsq = nums[r] * nums[r];

            if(lsq > rsq ){
                res[idx] = lsq;
                idx--;
                l++;
            } else {
                res[idx] = rsq;
                idx--;
                r--;
            }
        }
        return res;
    }
}
