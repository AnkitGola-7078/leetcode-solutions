/*
 * Problem: Minimum Operations to Exceed Threshold Value I
 * Problem ID: 3331
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 44.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-17
 */

class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                c++;
            }
        }
        return c;
    }
}