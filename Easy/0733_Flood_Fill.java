/*
 * Problem: Flood Fill
 * Problem ID: 733
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 47 MB
 * Synced From: LeetCode
 * Date: 2026-07-29
 */

class Solution {
    static void f(int[][] image, int sr, int sc, int color,int m,int n,int org){
        if(sr>=m ||sc>=n ||sc<0 ||sr<0|| image[sr][sc]!=org){
            return;
        }
        image[sr][sc]=color;
        f(image,sr-1,sc,color,m,n,org);
        f(image,sr+1,sc,color,m,n,org);
        f(image,sr,sc-1,color,m,n,org);
        f(image,sr,sc+1,color,m,n,org);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int org=image[sr][sc];
        if(org == color) return image;
        f(image,sr,sc,color,m,n,org);
        return image;
    }
}