class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> st = new ArrayDeque<>();
        for(int i = 0; i < num.length(); i++){
            char digit = num.charAt(i);
            while(!st.isEmpty() && k > 0 && st.peek() > digit){
                st.pop();
                k -= 1;
            }
            st.push(digit);
        }

        while(!st.isEmpty() && k > 0){
            st.pop();
            k--;
        }

        if(st.isEmpty()) return "0";

        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }

        while(str.length() > 0 && 
        str.charAt(str.length() - 1) == '0'){
            str.deleteCharAt(str.length() - 1);
        }

        str.reverse();

        if(str.length() == 0) return "0";
        return str.toString();
    }
}