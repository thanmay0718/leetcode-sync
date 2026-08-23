class Solution {
    // Boyer Moore Voting Algo (Optimal)
    // T.C : O(n)
    // S.C : O(1)
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int cnt = 1;
        for(int i = 1; i < nums.length; i++){
            if(cnt == 0){
                cnt = 1;
                candidate = nums[i];
                continue;
            }

            if(nums[i] == candidate){
                cnt++;
            } else {
                cnt--;
            }
        }
        return candidate;
    }
}