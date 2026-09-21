class Solution {
    // Brute Force O(n^2)
    public int sumSubarrayMins(int[] arr) {
        long min = 0;
        int mod = 1_000_000_007;
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            for(int j = i; j < arr.length; j++){
                curr = Math.min(curr, arr[j]);
                min = (min + curr) % mod;
            }
        }
        return (int) min;
    }
}