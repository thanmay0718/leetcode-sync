class MinStack {
    // By using 2 stacks we are pushing the Only minimum elements in our minStack otherwise we are not doing anything in our minStack. 
    private int[] stack;
    private int[] minStack;
    private int top;
    private int size;

    public MinStack() {
        size = 30000;
        stack = new int[size];
        minStack = new int[size];
        top = -1;
    }

    public void push(int val) {
        stack[++top] = val;

        if (top == 0) {
            minStack[top] = val;
        } 
        else {
            minStack[top] = Math.min(val, minStack[top - 1]);
        }
    }

    public void pop() {
        top--;
    }

    public int top() {
        return stack[top];
    }

    public int getMin() {
        return minStack[top];
    }
}