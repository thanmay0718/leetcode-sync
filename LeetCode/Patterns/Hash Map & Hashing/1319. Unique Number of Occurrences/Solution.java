class Solution {
    // Optimized Version : O(N) both Space and Time Complexity
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            set.add(e.getValue());
        }
        if(map.size() == set.size()){
            return true;
        }
        return false;
    }
}