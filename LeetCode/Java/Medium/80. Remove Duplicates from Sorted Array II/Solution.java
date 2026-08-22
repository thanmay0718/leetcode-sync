class Solution {
    public int removeDuplicates(int[] nums) {
        int pos = 1;
        int cnt = 1;
        for(int i = 1; i <= nums.length - 1; i++){
            if(nums[i] == nums[i - 1]){
                cnt++;
            } else {
                cnt = 1;
            }

            if(cnt <= 2){
                nums[pos] = nums[i];
                pos++;
            }
        }
        return pos;
    }
}