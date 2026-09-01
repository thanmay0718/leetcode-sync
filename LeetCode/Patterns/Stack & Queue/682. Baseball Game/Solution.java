class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String ch : operations){
            if(ch.equals("C")){
                stack.pop();
            } else if (ch.equals("D")){
                stack.push(2 * stack.peek());
            } else if (ch.equals("+")){
                int top = stack.pop();
                int newScore = top + stack.peek();
                stack.push(top);
                stack.push(newScore);
            } else {
                stack.push(Integer.parseInt(ch));
            }
        }
        int sum = 0;
        for(int num : stack){
            sum += num;
        }
        return sum;
    }
}