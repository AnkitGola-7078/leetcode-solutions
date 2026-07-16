/*
 * Problem: Left and Right Sum Differences
 * Problem ID: 2714
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms
 * Memory: 46.1 MB
 * Synced From: LeetCode
 * Date: 2026-07-16
 */

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int Rightsum=0;
        for(int i:nums){
            Rightsum+=i;
        }

        int leftsum=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           Rightsum-=nums[i];
           arr[i]=Math.abs(Rightsum-leftsum);
           leftsum+=nums[i];
        }
        return arr;
    }
}