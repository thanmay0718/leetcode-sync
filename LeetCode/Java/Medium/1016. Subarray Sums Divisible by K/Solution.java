class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
       map.put(0,1);
       int cnt = 0;
       int prefix = 0;
       for(int i = 0; i < nums.length; i++){
        prefix += nums[i];
        // to avoid negative numbers
        int rem = ((prefix % k) + k) % k;
        if(map.containsKey(rem)){
            cnt += map.get(rem);
        }
        map.put(rem, map.getOrDefault(rem, 0) + 1);
       } 
       return cnt;
    }
}