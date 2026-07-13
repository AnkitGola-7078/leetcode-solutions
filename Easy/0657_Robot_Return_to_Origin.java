/*
 * Problem: Robot Return to Origin
 * Problem ID: 657
 * Difficulty: Easy
 * Language: Java
 * Runtime: 6 ms
 * Memory: 45.4 MB
 * Synced From: LeetCode
 * Date: 2026-07-13
 */

class Solution {
    public boolean judgeCircle(String moves) {
        int r=0,l=0,u=0,d=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                u++;
            }else if(ch=='D'){
                d++;
            }else if(ch=='R'){
               r++;
            }else if(ch=='L'){
                 l++;
            }
        }
        if(l==r){
            if(d==u){
                return true;
            }
        }
        return false;
        
    }
}
