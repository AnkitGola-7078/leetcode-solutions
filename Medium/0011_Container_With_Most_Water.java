/*
 * Problem: Container With Most Water
 * Problem ID: 11
 * Difficulty: Medium
 * Language: Java
 * Runtime: 5 ms
 * Memory: 57.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-09
 */

class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int maxarea=0;
        int l=0;
        int h=n-1;
        while(l<h){
             int area=Math.min(arr[l],arr[h])*(h-l);
             maxarea=Math.max(maxarea,area);
             if(arr[l]<arr[h]){
                 l++;
             }else{
                 h--;
             }

        }
        return maxarea;
    }
}