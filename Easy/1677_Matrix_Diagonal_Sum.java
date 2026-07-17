/*
 * Problem: Matrix Diagonal Sum
 * Problem ID: 1677
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 46.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-17
 */

class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){
                    s+=mat[i][j];
                }
                if(i+j==mat.length-1 && i!=j){
                      s+=mat[i][j];
                }
            }
        }
        return s;
    }
}