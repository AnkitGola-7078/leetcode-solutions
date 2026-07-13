/*
 * Problem: Split Strings by Separator
 * Problem ID: 2881
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms
 * Memory: 47.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-13
 */

class Solution {
    public List<String> splitWordsBySeparator(List<String> wrd, char separator) {
        List<String> l=new ArrayList<>();

         for(String s:wrd){
            int idx=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==separator){
                    if(idx<i){
                        l.add(s.substring(idx,i));
                    }
                    idx=i+1;
                }
            }
            if(idx<s.length()){
                l.add(s.substring(idx));
            }
         }
         return l;
    }
}