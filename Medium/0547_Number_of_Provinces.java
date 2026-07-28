/*
 * Problem: Number of Provinces
 * Problem ID: 547
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 47.4 MB
 * Synced From: LeetCode
 * Date: 2026-07-28
 */

class Solution {
    static void dfs(int start,int[][] isConnected,boolean visited[]){
        visited[start]=true;
        for(int i=0;i<isConnected[0].length;i++){
            if(visited[i]==false && isConnected[start][i]==1){
                dfs(i,isConnected,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean visited[]=new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                c++;
                dfs(i,isConnected,visited);
            }
        }
        return c;
    }
}