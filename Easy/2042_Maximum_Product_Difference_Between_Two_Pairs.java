/*
 * Problem: Maximum Product Difference Between Two Pairs
 * Problem ID: 2042
 * Difficulty: Easy
 * Language: Java
 * Runtime: 10 ms
 * Memory: 47.8 MB
 * Synced From: LeetCode
 * Date: 2026-07-05
 */

class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return (nums[n-1]*nums[n-2]) - (nums[0]*nums[1]);
        
    }
}