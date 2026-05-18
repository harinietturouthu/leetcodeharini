class MinStack {
Stack<Integer> s=new Stack<>();
Stack<Integer> s1=new Stack<>();
    public MinStack() {
    
    }
     int min=Integer.MAX_VALUE;
    public void push(int val) {
        s.push(val);
        if(s1.empty()){
            s1.push(val);
        }else{
       min=Math.min(val,s1.peek());
       s1.push(min);
    }
    }
public void pop() {
        s.pop();
        s1.pop();
    }
    public int getMin() {
     return s1.peek();

    }
  
    
    public int top() {
       return s.peek();
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