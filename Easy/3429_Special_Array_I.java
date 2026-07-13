/*
 * Problem: Special Array I
 * Problem ID: 3429
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 44.8 MB
 * Synced From: LeetCode
 * Date: 2026-07-13
 */

class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if((nums[i]+nums[i-1])%2==0){ // e+e=e or o+o=odd 
                return false;
            }
        }
        return true;
    }
}