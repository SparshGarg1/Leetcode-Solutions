class MyStack {
    Queue<Integer> q = new LinkedList<Integer>();
    Queue<Integer> temp = new LinkedList<Integer>();

    
    public void push(int x) 
    {
        if(q.size()==0) q.add(x);
        else
        {
            temp.add(x);
            while(q.size()!=0)
            {
                temp.add(q.remove());
            }
            q=temp;
            temp= new LinkedList<>();
        }
    }
    
    public int pop() {
     return q.remove();   
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size()==0;
    }
}