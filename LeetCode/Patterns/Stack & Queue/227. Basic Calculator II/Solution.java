class Solution {
    public int calculate(String s) {
    List<String> rpn = toRPN(s);
    return evalRPN(rpn);
    }

    private int precedence(char op) {
        return (op == '*' || op == '/') ? 2 : 1;
    }

    // Pass 1: convert infix to RPN (shunting-yard)
    private List<String> toRPN(String s) {
        List<String> output = new ArrayList<>();
        Deque<Character> ops = new ArrayDeque<>();
        int i = 0, n = s.length();

        while (i < n) {
            char c = s.charAt(i);
            if (c == ' ') {
                i++;
            } else if (Character.isDigit(c)) {
                int start = i;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    i++;
                }
                output.add(s.substring(start, i));
            } else {
                // Pop equal-or-higher precedence to keep left-associativity
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c)) {
                    output.add(String.valueOf(ops.pop()));
                }
                ops.push(c);
                i++;
            }
        }
        while (!ops.isEmpty()) {
            output.add(String.valueOf(ops.pop()));
        }
        return output;
    }

    // Pass 2: evaluate the RPN sequence
    private int evalRPN(List<String> tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (token.length() == 1 && "+-*/".contains(token)) {
                int right = stack.pop();
                int left = stack.pop();
                if (token.equals("+")) stack.push(left + right);
                else if (token.equals("-")) stack.push(left - right);
                else if (token.equals("*")) stack.push(left * right);
                else stack.push(left / right);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}