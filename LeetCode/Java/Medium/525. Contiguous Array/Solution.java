class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        int i = 0;
        for(i = 0; i < nums.length; i++){
            int zero = 0;
            int one = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j] == 0){
                    zero++;
                } else {
                    one++;
                }
                if(zero == one){
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
}