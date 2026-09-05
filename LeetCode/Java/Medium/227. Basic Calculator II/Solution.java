class Solution {
    public int calculate(String s) {
    int result = 0;
    int lastNum = 0;
    int currentNum = 0;
    char prevOp = '+';

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);

        if (Character.isDigit(c)) {
            currentNum = currentNum * 10 + (c - '0');
        }

        if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
            if (prevOp == '+') {
                result += lastNum;
                lastNum = currentNum;
            } else if (prevOp == '-') {
                result += lastNum;
                lastNum = -currentNum;
            } else if (prevOp == '*') {
                lastNum = lastNum * currentNum;
            } else if (prevOp == '/') {
                lastNum = lastNum / currentNum;
            }
            prevOp = c;
            currentNum = 0;
        }
    }

    return result + lastNum;
}
}