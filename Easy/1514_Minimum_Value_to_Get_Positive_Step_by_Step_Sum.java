/*
 * Problem: Minimum Value to Get Positive Step by Step Sum
 * Problem ID: 1514
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-11
 */

class Solution {
    public int minStartValue(int[] nums) {
        int t=0;
        int min=0;
        for(int i:nums){
            t+=i;
            min=Math.min(min,t);
        }
        return 1-min;
    

    }
}