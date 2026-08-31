class Solution {
    public String removeDuplicateLetters(String s) {
    int[] lastIndex = new int[26];
    for (int i = 0; i < s.length(); i++) {
        lastIndex[s.charAt(i) - 'a'] = i;
    }

    boolean[] inStack = new boolean[26];
    StringBuilder stack = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        // Skip if this character is already in our result
        if (inStack[ch - 'a']) continue;

        // Pop characters that are larger and appear later
        while (stack.length() > 0
                && stack.charAt(stack.length() - 1) > ch
                && lastIndex[stack.charAt(stack.length() - 1) - 'a'] > i) {
            inStack[stack.charAt(stack.length() - 1) - 'a'] = false;
            stack.deleteCharAt(stack.length() - 1);
        }

        stack.append(ch);
        inStack[ch - 'a'] = true;
    }

    return stack.toString();
}
}