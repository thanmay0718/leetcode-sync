class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int cnt = 0;
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int need = sum - k;
            if(map.containsKey(need)){
                cnt++;
                map.put(need, map.getOrDefault(need, 0) + 1);
            }
            map.put(sum,i);
        }
        return cnt;
    }
}