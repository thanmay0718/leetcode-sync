class Solution {
    // Optimized : O(n)
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0;
        int sum = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] == 0){
                sum -= 1;
            } else {
                sum += 1;
            }

            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
            i++;
        }
        return maxLen;
    }
}