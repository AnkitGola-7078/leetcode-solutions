/*
 * Problem: String Compression
 * Problem ID: 443
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms
 * Memory: 45.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-15
 */

class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<chars.length){
            int c=0;
            char current=chars[i];
            while(i<chars.length && chars[i]==current){
                i++;
                c++;
            }
            sb.append(current);
            if(c>1){
                sb.append(c);
            }
        }

        for(int j=0;j<sb.length();j++){
            chars[j]=sb.charAt(j);
        }
        return sb.length();
    }
}