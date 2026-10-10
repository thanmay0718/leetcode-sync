class Solution {
    public int totalFruit(int[] fruits) {
        int maxFruits = 0;
        int l = 0;
        int r = 0;

        Map<Integer, Integer> map = new HashMap<>();
        while(r < fruits.length){
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

            if(map.size() > 2){
                while(map.size() > 2){
                    map.put(fruits[l], map.get(fruits[l]) - 1);
                    if(map.get(fruits[l]) == 0){
                        map.remove(fruits[l]);
                    }
                    l++;
                }
            }

            if(map.size() <= 2){
                maxFruits = Math.max(maxFruits, r - l + 1);
            }
            r++;
        }
        return maxFruits;
    }
}