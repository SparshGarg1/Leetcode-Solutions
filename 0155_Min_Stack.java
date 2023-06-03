class MinStack 
{
    //normal stack
    Stack<Integer> st = new Stack<>();

    //stack storing minimum values
    Stack<Integer> stmin = new Stack<>();
    
    public void push(int x) 
    {
        st.push(x);
        if(stmin.isEmpty() || x<=stmin.peek()) stmin.push(x);
    }
    
    public void pop() 
    {      
         if(st.pop().equals(stmin.peek()))    //Main stk always pop
            stmin.pop();   
    }
    
    public int top() 
    {       
        return st.peek();
    }
    
    public int getMin() 
    {    
        return stmin.peek();    
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