/*
 * Problem: Append Characters to String to Make Subsequence
 * Problem ID: 2572
 * Difficulty: Medium
 * Language: Java
 * Runtime: 7 ms
 * Memory: 47 MB
 * Synced From: LeetCode
 * Date: 2026-07-04
 */

class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                 j++;
            }
            i++;
        }
        return t.length()-j;
    }
}