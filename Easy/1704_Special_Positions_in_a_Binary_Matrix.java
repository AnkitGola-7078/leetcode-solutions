/*
 * Problem: Special Positions in a Binary Matrix
 * Problem ID: 1704
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms
 * Memory: 47 MB
 * Synced From: LeetCode
 * Date: 2026-07-17
 */

class Solution {
    public int numSpecial(int[][] mat) {
        int r[]=new int[mat.length];
        int c[]=new int[mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    r[i]++;
                    c[j]++;
                }
            }
        }

         int special=0;
         for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1 && r[i]==1 && c[j]==1){
                    special++;
                }
            }
        }
        return special;

        
    }
}