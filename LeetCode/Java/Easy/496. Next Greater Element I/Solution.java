class Solution {
    public int[] nextLargerElement(int[] arr) {
        int[] nxtGre = new int[arr.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = arr.length - 1; i >= 0; i--){
            int val = arr[i];
            while(!stack.isEmpty() && stack.peek() <= val){
                stack.pop();
            }

            if(stack.isEmpty()){
                nxtGre[i] = -1;
            } else {
                nxtGre[i] = stack.peek();
            }

            stack.push(val);
        }
        return nxtGre;
    }
}