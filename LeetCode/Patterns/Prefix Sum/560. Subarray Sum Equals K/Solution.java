class Solution {
    public int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0,1);
    int cnt = 0, sum = 0, target = 0;
        for(int i= 0; i < nums.length; i++){
            sum += nums[i];
            target = sum - k;
            if(map.containsKey(target)){
                cnt += map.get(target);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}