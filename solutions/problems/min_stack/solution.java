class MinStack {
    Stack<Integer> a = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(a.size() == 0){
            a.push(val);
            helper.push(val);
        }else{
            a.push(val);
            if(helper.peek() > val) helper.push(val);
            else helper.push(helper.peek());
        }
    }
    
    public void pop() {
        a.pop();
        helper.pop();
    }
    
    public int top() {
        return a.peek();
    }
    
    public int getMin() {
        return helper.peek();
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