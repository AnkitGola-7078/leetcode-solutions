/*
 * Problem: Valid Parentheses
 * Problem ID: 20
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms
 * Memory: 41.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-08
 */

class Solution {
    public boolean isValid(String s) {
        HashMap <Character,Character> hs =new HashMap <>();
        hs.put(')','(');
        hs.put('}','{');
        hs.put(']','[');
        Stack <Character> st = new Stack <>();
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);

         if(hs.containsValue(t)){
            st.push(t);

         }
         else if(hs.containsKey(t)){
            if(st.isEmpty()||st.pop()!=hs.get(t)){
                return false;
            }
         }
        }
        return st.isEmpty();
    }
}