/*
 * Problem: GCD of Odd and Even Sums
 * Problem ID: 3995
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 42.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-15
 */

class Solution {
    static int gcd(int a,int b){
        while(b!=0){
         int t=b;
         b=a%b;
         a=t;
        }
       return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int sumEven=n*(n+1);
        int sumOdd=(int)Math.pow(n,2);
        return gcd(sumEven,sumOdd);
    }
}