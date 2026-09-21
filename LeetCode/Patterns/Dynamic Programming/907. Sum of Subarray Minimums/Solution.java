class Solution {
    public int sumSubarrayMins(int[] arr) {
        int min = 0;
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            for(int j = i; j < arr.length; j++){
                curr = Math.min(curr, arr[j]);
                min += curr;
            }
        }
        return min;
    }
}