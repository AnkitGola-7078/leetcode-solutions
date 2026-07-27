/*
 * Problem: Maximum Score After Splitting a String
 * Problem ID: 1537
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 42.5 MB
 * Synced From: LeetCode
 * Date: 2026-07-27
 */

class Solution {
    public int maxScore(String s) {
        int oneCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                oneCount++;
            }
        }

        int zeroCount=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='1'){
                oneCount--;
            }else{
                zeroCount++;
            }
            max=Math.max(max,oneCount+zeroCount);
        }
        return max;
       

    }
}