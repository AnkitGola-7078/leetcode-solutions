/*
 * Problem: K Closest Points to Origin
 * Problem ID: 1014
 * Difficulty: Medium
 * Language: Java
 * Runtime: 21 ms
 * Memory: 60.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-07
 */

class Solution {
    public int[][] kClosest(int[][] points, int K) {
      Arrays.sort(points, (p1, p2) -> p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1]);
      return Arrays.copyOfRange(points, 0, K);
    }
}