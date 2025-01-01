class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.empty() && minStack.empty()){
            stack.push(val);
            minStack.push(val);
        } else {
            stack.push(val);
            if(val <= minStack.peek())
                minStack.push(val);
        }
    }
    
    public void pop() {
        int popped = stack.pop();
        if(minStack.peek() == popped)
            minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */