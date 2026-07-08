/*
 * Problem: Generate Parentheses
 * Problem ID: 22
 * Difficulty: Medium
 * Language: Java
 * Runtime: 14 ms
 * Memory: 52.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-08
 */

class Solution {
    static void f(int n,int ob,int cb,String ans,List<String> l,Map<String,Boolean> dp){
        if(ob>n/2 || cb>ob){
            return;
        }
        if(ob+cb==n){
            l.add(ans);
            return;
        }

        String key = ob + "," + cb + "," + ans;
        if (dp.containsKey(key)) return;  
        dp.put(key, true);
               
        f(n,ob+1,cb,ans+"(",l,dp);
        f(n,ob,cb+1,ans+")",l,dp);
    }
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        Map<String,Boolean> dp=new HashMap<>();
        f(n*2,0,0,"",l,dp);
        return l;
    }
}