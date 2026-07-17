/*
 * Problem: Number of Employees Who Met the Target
 * Problem ID: 2876
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 44.4 MB
 * Synced From: LeetCode
 * Date: 2026-07-17
 */

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                c++;
            }
        }
        return c;
    }
}