/*
 * Problem: Generate Binary Strings Without Adjacent Zeros
 * Problem ID: 3453
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms
 * Memory: 47.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-25
 */

class Solution {
    static void f(int n,String curr, List<String> ans){
        if(curr.length()==n){
            ans.add(curr); 
            return;
        }

        f(n,curr+"1",ans);
        if(curr.isEmpty()|| curr.charAt(curr.length()-1)=='1'){
            f(n,curr+"0",ans);
        }
        
    }
    public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<>();
        f(n,"",ans);
        return ans;

    }
}