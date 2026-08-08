/*
 * Problem: Ugly Number
 * Problem ID: 263
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 42.5 MB
 * Synced From: LeetCode
 * Date: 2026-08-08
 */

class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        while(n!=1){
            if(n%2==0) n/=2;
            else if(n%3==0) n/=3;
            else if(n%5==0) n/=5;
            else return false;
        }
        return true;
    }
}