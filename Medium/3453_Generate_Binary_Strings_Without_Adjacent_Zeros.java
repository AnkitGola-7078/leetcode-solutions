/*
 * Problem: Generate Binary Strings Without Adjacent Zeros
 * Problem ID: 3453
 * Difficulty: Medium
 * Language: Java
 * Runtime: 32 ms
 * Memory: 47.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-25
 */

class Solution {
    static void f(int n,String curr, List<String> ans){
        if(curr.length()==n){
            boolean f=true;
          for(int i=1;i<curr.length();i++){
            if((curr.charAt(i)=='0') && (curr.charAt(i-1)=='0')){
                f=false;
                break;
            }
          }
           
           if(f){
            ans.add(curr);
           }
           return;
        }
        f(n,curr+"0",ans);
        f(n,curr+"1",ans);
    }
    public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<>();
        f(n,"",ans);
        return ans;

    }
}