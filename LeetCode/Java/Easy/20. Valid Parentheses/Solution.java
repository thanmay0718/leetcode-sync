class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    Map<Character, Character> matchMap = Map.of(')', '(', ']', '[', '}', '{');

    for (char c : s.toCharArray()) {
        if (matchMap.containsKey(c)) {
            if (stack.isEmpty() || stack.pop() != matchMap.get(c)) {
                return false;
            }
        } else {
            stack.push(c);
        }
    }
    return stack.isEmpty();
    }
}
