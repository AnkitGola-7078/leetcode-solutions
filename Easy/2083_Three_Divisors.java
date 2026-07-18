/*
 * Problem: Three Divisors
 * Problem ID: 2083
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 42.3 MB
 * Synced From: LeetCode
 * Date: 2026-07-18
 */

class Solution {
    public boolean isThree(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        return c==3;
    }
}