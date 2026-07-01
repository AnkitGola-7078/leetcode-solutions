/*
 * Problem: Counting Words With a Given Prefix
 * Problem ID: 2292
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 44.5 MB
 * Synced From: LeetCode
 * Date: 2026-07-01
 */

class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
                c++;
            }
        }
        return c;
    }
}