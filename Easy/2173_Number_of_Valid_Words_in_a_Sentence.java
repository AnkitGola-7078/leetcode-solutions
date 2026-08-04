/*
 * Problem: Number of Valid Words in a Sentence
 * Problem ID: 2173
 * Difficulty: Easy
 * Language: Java
 * Runtime: 41 ms
 * Memory: 47.7 MB
 * Synced From: LeetCode
 * Date: 2026-08-04
 */

class Solution {
    public int countValidWords(String sen) {
        int c=0;
        String arr[]=sen.split("\\s+");
        for(int i=0;i<arr.length;i++){
            if(arr[i].matches("([a-z]+(-[a-z]+)?[!.,]?)|([!.,])")){
                c++;
            }
        }
        return c;
    }
}