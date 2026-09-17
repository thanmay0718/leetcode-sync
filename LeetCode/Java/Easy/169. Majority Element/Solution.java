class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int threshold = nums.length / 2;
        for(int i = 0; i < nums.length; i++){
            int cnt = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], cnt);
            if(cnt > threshold){
                return nums[i];
            }
        }
        return -1;
    }
}