class MinStack {
    int top,size;
    int[] stack,minStack;
    public MinStack() {
        size=1000;
        top=-1;
        stack = new int[size];
        minStack = new int[size];
    }
    
    public void push(int val) {
        if(top==size-1)
            return;
        stack[++top] = val;
        if(top==0)
            minStack[top] = val;
        else
            minStack[top] = Math.min(val,minStack[top-1]);
    }
    
    public void pop() {
        if(top==-1)
            return;
        top--;
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        return minStack[top];
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