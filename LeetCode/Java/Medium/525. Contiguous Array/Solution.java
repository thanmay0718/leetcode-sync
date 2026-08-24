class Solution {
    // Brute Force : O(n^2)
    // Chevcking eaach and every Index's to get a maximum of equals between both 0's and 1's 
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