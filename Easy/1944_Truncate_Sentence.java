/*
 * Problem: Truncate Sentence
 * Problem ID: 1944
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms
 * Memory: 43.2 MB
 * Synced From: LeetCode
 * Date: 2026-07-01
 */

class Solution {
    public String truncateSentence(String s, int k) {
        String arr[]=s.split(" ");
        String ans[]=new String[k];
        for(int i=0;i<k;i++){
            ans[i]=arr[i];
        }

        return String.join(" ",ans);
    }
}