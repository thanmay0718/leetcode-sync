class Solution {
    public int majorityElement(int[] nums) {
        int max = 0;
        int ans = nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x,0) + 1);
            if (map.get(x) > max){
                max = map.get(x);
                ans = x;
            }
        }
        return ans;
    }
}