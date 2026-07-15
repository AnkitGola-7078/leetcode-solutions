/*
 * Problem: Minimum Distance Between Three Equal Elements I
 * Problem ID: 4115
 * Difficulty: Easy
 * Language: Java
 * Runtime: 9 ms
 * Memory: 44.5 MB
 * Synced From: LeetCode
 * Date: 2026-07-15
 */

class Solution {
    public int minimumDistance(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                if (nums[i] == nums[j] && nums[j] == nums[k]){
                    int a=Math.abs(i-j);
                    int b=Math.abs(j-k);
                    int c=Math.abs(k-i);
                    if(a+b+c<min){
                        min=a+b+c;
                    }
                }
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}