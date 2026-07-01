/*
 * Problem: Asteroid Collision
 * Problem ID: 735
 * Difficulty: Medium
 * Language: Java
 * Runtime: 5 ms
 * Memory: 47.3 MB
 * Synced From: LeetCode
 * Date: 2026-07-01
 */

class Solution {
    public int[] asteroidCollision(int[] ast) {
        
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ast.length;i++){
            if(ast[i]>0){
                st.push(ast[i]);
            }else{

                while(!st.isEmpty() && st.peek()>0 && st.peek()<-ast[i]){
                    st.pop();
                }
            
                if(st.isEmpty() || st.peek()<0){
                    st.push(ast[i]);
                }else if(st.peek() == -ast[i]){
                    st.pop();
                }
               
            }

        }

            int arr[]=new int[st.size()];
            for(int i=st.size()-1;i>=0;i--){
                arr[i]=st.pop();
            }
            return arr;
        
        
    }
}