/*
 * Problem: Jewels and Stones
 * Problem ID: 782
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.9 MB
 * Synced From: LeetCode
 * Date: 2026-07-02
 */

class Solution {
    public int numJewelsInStones(String jl, String st) {
        int c=0;
        for(int i=0;i<st.length();i++){
            if(jl.indexOf(st.charAt(i))!=-1){
                c++;
            }
        }
        return c;
    }
}