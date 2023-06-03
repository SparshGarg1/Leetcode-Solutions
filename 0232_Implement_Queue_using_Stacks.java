class MyQueue {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    
    public void push(int x) 
    {
        
            
        while(!s.isEmpty())
        {
            temp.push(s.pop());
        }
        temp.push(x);
        
       while(!temp.isEmpty())
        {
            s.push(temp.pop());
        }
        
        
    }
    
    public int pop() 
    {
        return s.pop();
    }
    
    public int peek() 
    {
        return s.peek();
    }
    
    public boolean empty() 
    {
        return s.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */