/*
 * Problem: Boats to Save People
 * Problem ID: 917
 * Difficulty: Medium
 * Language: Java
 * Runtime: 19 ms
 * Memory: 56.5 MB
 * Synced From: LeetCode
 * Date: 2026-07-16
 */

class Solution {
    public int numRescueBoats(int[] pe, int limit) {
        Arrays.sort(pe);
        int i=0;
        int j=pe.length-1;
        int ans=0;
        while(i<=j){
            if(pe[i]+pe[j]<=limit){
                i++;
                j--;
            }else{
                j--;
            }
            ans++;
        }
        return ans;
    }
}