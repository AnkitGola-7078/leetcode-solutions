/*
 * Problem: Minimum Distance to the Target Element
 * Problem ID: 1975
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 45.2 MB
 * Synced From: LeetCode
 * Date: 2026-07-15
 */

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans=Math.min(ans,Math.abs(i-start));
            }
        }
        return ans;
    }
}