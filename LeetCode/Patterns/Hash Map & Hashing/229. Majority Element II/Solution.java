class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer> list = new ArrayList<>();
       Map<Integer, Integer> map = new HashMap<>();
       int threshold = nums.length / 3;
       for(int i : nums){
        map.put(i, map.getOrDefault(i, 0) + 1);
       }

       for(Map.Entry<Integer, Integer> e : map.entrySet()){
        if(e.getValue() > threshold){
            list.add(e.getKey());
        }
       }
       return list;
    }
}