class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int prev = i - map.get(nums[i]);
                if(prev <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}