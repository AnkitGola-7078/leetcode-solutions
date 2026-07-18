/*
 * Problem: Find Greatest Common Divisor of Array
 * Problem ID: 2106
 * Difficulty: Easy
 * Language: Java
 * Runtime: 6 ms
 * Memory: 45.9 MB
 * Synced From: LeetCode
 * Date: 2026-07-18
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
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int l=nums[nums.length-1];
        int s=nums[0];
        return gcd(s,l);
    }
}