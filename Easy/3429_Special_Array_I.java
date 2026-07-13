/*
 * Problem: Special Array I
 * Problem ID: 3429
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 45.3 MB
 * Synced From: LeetCode
 * Date: 2026-07-13
 */

class Solution {
    static boolean s(int i,int j){
      if(i%2==0 && j%2!=0){
        return true;
      }
      if(i%2!=0 && j%2==0){
        return true;
      }
      return false;
    }
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1) return true;
        boolean f=false;
        for(int i=0;i<nums.length-1;i++){

            if(!s(nums[i],nums[i+1])) return false;
        }
        return true;
    }
}