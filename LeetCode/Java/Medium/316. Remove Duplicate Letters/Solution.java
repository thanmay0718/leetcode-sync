class Solution {
    public String removeDuplicateLetters(String s) {
    // Find positions of each character
    Map<Character, List<Integer>> positions = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        positions.computeIfAbsent(s.charAt(i), k -> new ArrayList<>()).add(i);
    }

    List<Character> chars = new ArrayList<>(positions.keySet());
    Collections.sort(chars);
    String[] best = {null};

    // Try all combinations of picking one position per character
    generateCombinations(chars, positions, 0, new int[chars.size()], -1, best, s);
    return best[0];
}

private void generateCombinations(List<Character> chars, Map<Character, List<Integer>> positions,
                                   int idx, int[] chosen, int lastPos, String[] best, String s) {
    if (idx == chars.size()) {
        // Build the subsequence from chosen positions
        int[] sorted = chosen.clone();
        Arrays.sort(sorted);
        StringBuilder sb = new StringBuilder();
        for (int pos : sorted) {
            sb.append(s.charAt(pos));
        }
        String candidate = sb.toString();
        if (best[0] == null || candidate.compareTo(best[0]) < 0) {
            best[0] = candidate;
        }
        return;
    }

    for (int pos : positions.get(chars.get(idx))) {
        chosen[idx] = pos;
        generateCombinations(chars, positions, idx + 1, chosen, lastPos, best, s);
    }
}
}