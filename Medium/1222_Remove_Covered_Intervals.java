/*
 * Problem: Remove Covered Intervals
 * Problem ID: 1222
 * Difficulty: Medium
 * Language: Java
 * Runtime: 6 ms
 * Memory: 46.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-06
 */

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int c=1;
        Arrays.sort(intervals,(a,b) -> {
            if(a[0]==b[0])
                return b[1]-a[1];
                return a[0]-b[0];
            

        });
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(end<intervals[i][1]){
                c++;
                end=intervals[i][1];
            }
        }
        return c;
    }
}