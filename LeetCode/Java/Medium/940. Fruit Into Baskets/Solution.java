class Solution {
    public int totalFruit(int[] fruits) {
    int maxFruits = 0;

    for (int i = 0; i < fruits.length; i++) {
        Set<Integer> types = new HashSet<>();
        int count = 0;

        for (int j = i; j < fruits.length; j++) {
            types.add(fruits[j]);
            if (types.size() > 2) break;
            count++;
        }
        maxFruits = Math.max(maxFruits, count);
    }

    return maxFruits;
}
}