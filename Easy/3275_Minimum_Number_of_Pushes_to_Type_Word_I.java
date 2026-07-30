/*
 * Problem: Minimum Number of Pushes to Type Word I
 * Problem ID: 3275
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43.1 MB
 * Synced From: LeetCode
 * Date: 2026-07-30
 */

class Solution {
    public int minimumPushes(String word) {
        int ans=0;
        for(int i=0;i<word.length();i++){
             ans+=(i/8+1);
        }
        return ans;
    }
}