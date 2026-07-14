/*
 * Problem: Widest Vertical Area Between Two Points Containing No Points
 * Problem ID: 1742
 * Difficulty: Easy
 * Language: Java
 * Runtime: 40 ms
 * Memory: 89.5 MB
 * Synced From: LeetCode
 * Date: 2026-07-14
 */

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int max_width = 0;

        for (int i = 1; i < points.length; i++) {
            int width = points[i][0] - points[i - 1][0];
            max_width = Math.max(max_width, width);
        }

        return max_width;
    }
}