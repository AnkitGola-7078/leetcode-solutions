/*
 * Problem: Check if Matrix Is X-Matrix
 * Problem ID: 2398
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms
 * Memory: 47.4 MB
 * Synced From: LeetCode
 * Date: 2026-07-17
 */

class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==j || i+j==grid.length-1){
                    if(grid[i][j]==0) return false;
                }else if(grid[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
}