/*
 * Problem: Maximum Number of Balloons
 * Problem ID: 1297
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms
 * Memory: 43.5 MB
 * Synced From: LeetCode
 * Date: 2026-07-05
 */

class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[] = new int[26];
        for (char c : text.toCharArray()) {
            arr[c - 'a']++;
        }

        // balloon = b a l l o o n
        int b = arr['b' - 'a'];
        int a = arr['a' - 'a'];
        int l = arr['l' - 'a'] / 2; // l appears twice
        int o = arr['o' - 'a'] / 2; // o appears twice
        int n = arr['n' - 'a'];

        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }
}
