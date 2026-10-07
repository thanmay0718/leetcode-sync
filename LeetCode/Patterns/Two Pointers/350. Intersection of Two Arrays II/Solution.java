class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> l = new ArrayList<>();

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                l.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] res = new int[l.size()];
        int k = 0;
        for (int num : l) {
            res[k++] = num;
        }
        return res;
    }
}