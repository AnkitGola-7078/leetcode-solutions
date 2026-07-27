/*
 * Problem: Assign Cookies
 * Problem ID: 455
 * Difficulty: Easy
 * Language: Java
 * Runtime: 14 ms
 * Memory: 51.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-27
 */

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int c=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;
                c++;
            }
            j++;
        }
        return c;

    }
}