/*
 * Problem: Min Stack
 * Problem ID: 155
 * Difficulty: Medium
 * Language: Java
 * Runtime: 35 ms
 * Memory: 99.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-08
 */

class MinStack {
     Stack<Integer> minst;
     Stack<Integer> st;
    public MinStack() {
        st=new Stack<>();
        minst=new Stack<>();

    }
    
    public void push(int value) {
        st.push(value);
        if(minst.empty() || value <=minst.peek()){
            minst.push(value);
        }
    }
    
    public void pop() {
        int poped=st.pop();
        if(poped==minst.peek()){
            minst.pop();
        }
        
    }
      
    public int top() {
        return st.peek();
             
    }
    
    public int getMin() {
        return minst.peek();
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