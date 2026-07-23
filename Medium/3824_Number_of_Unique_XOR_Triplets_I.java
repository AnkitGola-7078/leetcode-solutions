/*
 * Problem: Number of Unique XOR Triplets I
 * Problem ID: 3824
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 125.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-23
 */

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n <= 2) return n;

        int mask = 0;
        for (int num : nums) {
            mask=mask|num;
        }

        return mask + 1;
    }
}