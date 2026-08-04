/*
 * Problem: Maximum Number of Words Found in Sentences
 * Problem ID: 2219
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms
 * Memory: 46 MB
 * Synced From: LeetCode
 * Date: 2026-08-04
 */

class Solution {
    
    public int mostWordsFound(String[] arr) {
        int max=0;
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            String arr1[]=s.split(" ");//["Hello", "World", "Java"]
            max=Math.max(max,arr1.length);
        }
        return max;
    }
}