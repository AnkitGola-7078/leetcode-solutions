/*
 * Problem: Valid Parentheses
 * Problem ID: 20
 * Difficulty: Easy
 * Language: Java
 * Runtime: 6 ms
 * Memory: 43.5 MB
 * Synced From: LeetCode
 * Date: 2026-07-08
 */

class Solution {
    public boolean isValid(String s) {
       HashMap<Character, Character> map =new HashMap<>();
       map.put(')','(');
       map.put(']','[');
       map.put('}','{');
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
           if(map.containsValue(s.charAt(i))){
            st.push(s.charAt(i));
           }else if(map.containsKey(s.charAt(i))){
              if(st.isEmpty() || st.pop()!=map.get(s.charAt(i))){
                    return false;
              }
              
           }

        }
        return st.isEmpty();

        
    }
}