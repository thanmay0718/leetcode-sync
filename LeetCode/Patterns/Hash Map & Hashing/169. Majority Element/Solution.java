class Solution {
    // Brute Force
    // T.C : O(n^2)
    // S.C : O(1)
    public int majorityElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int cnt = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j] == nums[i]){
                    cnt++;
                }
            }
            if(cnt > nums.length / 2){
                return nums[i];
            }
        }
        return -1;
    }
}