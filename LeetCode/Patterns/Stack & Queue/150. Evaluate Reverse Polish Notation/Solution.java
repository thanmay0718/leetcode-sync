class Solution {
    public int evalRPN(String[] tokens) {
        // Optimal approach using only one extra space and for traversing upto n so O(n) and O(n)
        Stack<Integer> stack = new Stack<>();
        for(String t : tokens){
            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                int val = 0;

                if(t.equals("+")){
                    val = a + b;
                    stack.push(val);
                } else if (t.equals("-")){
                    val = a - b;
                    stack.push(val);
                } else if (t.equals("*")) {
                    val = a * b;
                    stack.push(val);
                } else {
                    val = a / b;
                    stack.push(val);
                }
            } else {
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.peek();
    }
}