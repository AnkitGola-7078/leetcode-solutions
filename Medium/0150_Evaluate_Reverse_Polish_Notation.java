/*
 * Problem: Evaluate Reverse Polish Notation
 * Problem ID: 150
 * Difficulty: Medium
 * Language: Java
 * Runtime: 6 ms
 * Memory: 45.3 MB
 * Synced From: LeetCode
 * Date: 2026-07-08
 */

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String c=tokens[i];
            if(c.equals("+")){
                int b=st.pop();
                int a=st.pop();
                st.push(a+b);
            }else if(c.equals("-")){
                int b=st.pop();
                int a=st.pop();
                st.push(a-b);
            }else if(c.equals("*")){
                int b=st.pop();
                int a=st.pop();
                st.push(a*b);
            }else if(c.equals("/")){
                int b=st.pop();
                int a=st.pop();
                st.push(a/b);
            }else{
                st.push(Integer.parseInt(c));
            }
           
           
        }
        return st.pop();
    }
}