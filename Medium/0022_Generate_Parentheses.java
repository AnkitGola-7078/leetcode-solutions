/*
 * Problem: Generate Parentheses
 * Problem ID: 22
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms
 * Memory: 44.9 MB
 * Synced From: LeetCode
 * Date: 2026-07-08
 */

class Solution {
    static void f(int n,int ob,int cb,String ans,List<String> l){
        if(ob>n/2 || cb>ob){
            return;
        }
        if(ob+cb==n){
            l.add(ans);
            return;
        }
               
        f(n,ob+1,cb,ans+"(",l);
        f(n,ob,cb+1,ans+")",l);
    }
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        f(n*2,0,0,"",l);
        return l;
    }
}