/*
 * Problem: Count Good Numbers
 * Problem ID: 2050
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.1 MB
 * Synced From: LeetCode
 * Date: 2026-07-25
 */

class Solution {
    static long pow(long x,long n)
    {
        if(n==0) return 1;
         if(n<0) return 1/pow(x,-n);
        if(n%2==0) {
            long half=pow(x,n/2);
            return (half*half)%1000000007;
        } 
        return (x*pow(x,n-1))%1000000007;
    }
    public int countGoodNumbers(long n) {
        // FOR EVEN 0,2,4,6,8(5 choice)
        //for prime 2 3 5 7 ( 4 choice)
        long evenCount=(n+1)/2;
        long oddCount=n/2;
        long ans=(long)(pow(5,evenCount)*pow(4,oddCount))%1000000007;
        return (int)ans;
    }
}