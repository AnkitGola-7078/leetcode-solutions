/*
 * Problem: Partition Equal Subset Sum
 * Problem ID: 416
 * Difficulty: Medium
 * Language: Java
 * Runtime: 105 ms
 * Memory: 72.4 MB
 * Synced From: LeetCode
 * Date: 2026-07-16
 */

class Solution {
    public static Boolean subset(int i, int s, int arr[], int t, Boolean dp[][]) {
        if (s == t) return true;
        if (i == arr.length || s > t) return false;

        if (dp[i][s] != null) return dp[i][s];

        boolean skip = subset(i + 1, s, arr, t, dp);
        boolean take = subset(i + 1, s + arr[i], arr, t, dp);

        return dp[i][s] = skip || take;
    }

    public boolean canPartition(int[] nums) {
        int s = 0;
        for (int i : nums) s += i;

        if (s % 2 != 0) return false;
        int t = s / 2;

        Boolean dp[][] = new Boolean[nums.length][t + 1];
        return subset(0, 0, nums, t, dp);
    }
}