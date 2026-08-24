class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int freq[] = new int[k];

        freq[0] = 1;

        int prefixSum = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            prefixSum += nums[i];

            int remainder = prefixSum % k;

            if(remainder < 0) {
                remainder += k;
            }

            count += freq[remainder];
            freq[remainder]++;
        }

        return count;
    }
}