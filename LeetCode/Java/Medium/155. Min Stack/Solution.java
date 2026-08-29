class MinStack {

    private int[] stack;
    private int size;
    private int top;

    public MinStack() {
        size = 100;
        stack = new int[size];
        top = -1;
    }
    
    public void push(int value) {
        if(top == size - 1){
            return;
        }
        stack[++top] = value;
    }
    
    public void pop() {
        if(top == -1){
            return;
        }
        top--;
    }
    
    public int top() {
        if(top == -1) {
            return -1;
        }
        return stack[top];
    }
    
    public int getMin() {
        if(top == -1) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= top; i++){
            if(stack[i] < min){
                min = stack[i];
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */