class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer> res = new ArrayList<>();
       Map<Integer, Integer> map = new HashMap<>();
       int min = nums.length / 3 + 1;
       for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) == min){
                res.add(nums[i]);
            }
            if( res.size() == 2){
                break;
            }
       } 
       return res;
    }
}