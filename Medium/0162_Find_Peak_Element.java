/*
 * Problem: Find Peak Element
 * Problem ID: 162
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 44 MB
 * Synced From: LeetCode
 * Date: 2026-07-08
 */

class Solution {
    public int findPeakElement(int[] nums) {
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int m=(h+l)/2;
            if(nums[m]<nums[m+1]){
                 l=m+1;
            }else{
                h=m;
            }
        }
        return l;
    }
}