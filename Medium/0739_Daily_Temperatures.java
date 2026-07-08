/*
 * Problem: Daily Temperatures
 * Problem ID: 739
 * Difficulty: Medium
 * Language: Java
 * Runtime: 74 ms
 * Memory: 107.9 MB
 * Synced From: LeetCode
 * Date: 2026-07-08
 */

class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] arr=new int[temp.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temp.length;i++){
            while(!st.isEmpty() && temp[st.peek()]<temp[i]){
                arr[st.peek()]=i-st.pop();
            }
            st.push(i);
              
        }
        return arr;
    }
}