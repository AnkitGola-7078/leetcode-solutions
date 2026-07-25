/*
 * Problem: Pow(x, n)
 * Problem ID: 50
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 48.1 MB
 * Synced From: LeetCode
 * Date: 2026-07-25
 */

class Solution {
    public double myPow(double x, long n) {
        
        if(n == 0) return 1;
        if(n < 0) return 1 / myPow(x, -n);
        if(n % 2 == 0) return myPow(x * x, n / 2);
        return x * myPow(x, n - 1);
    }
    
}