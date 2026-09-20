class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int[] arr = new int[nums.length];

        for(int i = nums.length - 1; i >= 0; i--){
            int lsq = nums[l] * nums[l];
            int rsq = nums[r] * nums[r];

            if(lsq > rsq){
                arr[i] = lsq;
                l++;
            } else {
                arr[i] = rsq;
                r--;
            }
        }    
        return arr;    
    }
}