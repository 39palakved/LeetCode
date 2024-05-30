class MinStack {

    Stack <Integer> obj = new Stack<>();
    ArrayList<Integer> li = new ArrayList<>();
    
    public void push(int val) {
        obj.push(val);
        li.add(val);
       
       
    }
    
    public void pop() {
       
        li.remove(obj.pop());
      
        
    }
    
    public int top() {
      int top =  obj.peek(); 
        return top;
    }
    
    public int getMin() {
        
       Collections.sort(li);
        return li.get(0) ;
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