class Solution {
    public int calculate(String s) {
    Stack<Integer> stack = new Stack<>();
    int currentNum = 0;
    char prevOp = '+';

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);

        if (Character.isDigit(c)) {
            currentNum = currentNum * 10 + (c - '0');
        }

        // Process when we hit an operator or the end of string
        if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
            if (prevOp == '+') {
                stack.push(currentNum);
            } else if (prevOp == '-') {
                stack.push(-currentNum);
            } else if (prevOp == '*') {
                stack.push(stack.pop() * currentNum);
            } else if (prevOp == '/') {
                stack.push(stack.pop() / currentNum);
            }
            prevOp = c;
            currentNum = 0;
        }
    }

    // Sum all values in the stack
    int result = 0;
    for (int val : stack) {
        result += val;
    }
    return result;
}
}