class Solution {
    // Brute Force Logic (O(n^2))
    public int[] nextGreaterElements(int[] nums) {
        int[] greaterEle = new int[nums.length];
        Arrays.fill(greaterEle, -1);

        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            for(int j = 1; j < nums.length; j++){
                int val = (j + i) % nums.length;
                if(nums[val] > cur){
                    greaterEle[i] = nums[val];
                    break;
                }
            }
        }
        return greaterEle;
    }
}