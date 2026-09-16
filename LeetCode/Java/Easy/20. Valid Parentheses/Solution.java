class Solution {

    private boolean matchCheck(char open, char close){
        if((open == '(' && close == ')') ||
            (open == '{' && close == '}') ||
            (open == '[' && close == ']')
        ){
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else {
                if(stack.isEmpty()) return false;
                char open = stack.peek();
                stack.pop();
                if(!matchCheck(open, ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}