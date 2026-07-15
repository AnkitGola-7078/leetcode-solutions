/*
 * Problem: Mirror Distance of an Integer
 * Problem ID: 4168
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms
 * Memory: 42.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-15
 */

class Solution {
    static int rev(int n){
       String s=Integer.toString(n);
       StringBuilder sb=new StringBuilder();
       sb.append(s);
       sb.reverse();
       String r=sb.toString();
       return Integer.parseInt(r);
    
    }
    public int mirrorDistance(int n) {
        return Math.abs(n-rev(n));
    }
}