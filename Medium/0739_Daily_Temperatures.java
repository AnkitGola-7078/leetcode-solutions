/*
 * Problem: Daily Temperatures
 * Problem ID: 739
 * Difficulty: Medium
 * Language: Java
 * Runtime: 74 ms
 * Memory: 62.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-08
 */

class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int res[]=new int[temp.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<temp.length;i++){
            while(!s.isEmpty() && temp[s.peek()]<temp[i]){
                res[s.peek()] = i - s.pop();
            }
            s.push(i);
        }
        return res;
    }
}