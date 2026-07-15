/*
 * Problem: Two Furthest Houses With Different Colors
 * Problem ID: 2199
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43 MB
 * Synced From: LeetCode
 * Date: 2026-07-15
 */

class Solution {
    public int maxDistance(int[] A) {
        int n = A.length;
        int left = 0, right = 0;

        for (int i = 0; i < n; i++)
            if (A[i] != A[n - 1]) {
                left = i;
                break;
            }

        for (int i = n - 1; i >= 0; i--)
            if (A[i] != A[0]) {
                right = i;
                break;
            }

        return Math.max(n - 1 - left, right);
    }
}