class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st = new ArrayDeque<>();
        for(String op : operations){
            if(op.equals("C")){
                st.pop();
            } else if (op.equals("D")){
                st.push(2 * st.peek());
            } else if (op.equals("+")){
                int top = st.pop();
                int newScore = top + st.peek();
                st.push(top);
                st.push(newScore);
            } else {
                st.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(int i : st){
            sum += i;
        }
        return sum;
    }
}