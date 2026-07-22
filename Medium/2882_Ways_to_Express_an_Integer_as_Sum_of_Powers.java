/*
 * Problem: Ways to Express an Integer as Sum of Powers
 * Problem ID: 2882
 * Difficulty: Medium
 * Language: Java
 * Runtime: 156 ms
 * Memory: 46.8 MB
 * Synced From: LeetCode
 * Date: 2026-07-22
 */

import java.util.*;

class Solution {
    static final int MOD = 1000000007;

    static int f(int n, int x, int num, int[][] dp) {
        if (n == 0) return 1;   // sum complete
        if (n < 0) return 0;    // invalid
        if (num > n) return 0;  // no more numbers possible

        if (dp[n][num] != -1) return dp[n][num];

        int p = (int)Math.pow(num, x);
        if (p > n) return dp[n][num] = 0;

        // include num^x + exclude num^x
        int include = f(n - p, x, num + 1, dp);
        int exclude = f(n, x, num + 1, dp);

        return dp[n][num] = (include + exclude) % MOD;
    }

    public int numberOfWays(int n, int x) {
        int[][] dp = new int[n+1][n+1];
        for (int i = 0; i <= n; i++) Arrays.fill(dp[i], -1);
        return f(n, x, 1, dp);
    }
}
