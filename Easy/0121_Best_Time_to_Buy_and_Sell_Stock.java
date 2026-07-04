/*
 * Problem: Best Time to Buy and Sell Stock
 * Problem ID: 121
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 94.2 MB
 * Synced From: LeetCode
 * Date: 2026-07-04
 */

class Solution {
    public int maxProfit(int[] arr) {
        int mxsell=0;
        int bestbuy=arr[0];

        for(int i=0;i<arr.length;i++){
            bestbuy=Math.min(bestbuy,arr[i]);
            mxsell=Math.max(mxsell,arr[i]-bestbuy);
      
        }
        return mxsell;
    }
}