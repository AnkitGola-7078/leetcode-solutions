/*
 * Problem: Letter Combinations of a Phone Number
 * Problem ID: 17
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms
 * Memory: 49.3 MB
 * Synced From: LeetCode
 * Date: 2026-07-25
 */

class Solution {
    static void f(String dgt,String curr,int i,List<String> ans){
        if(i==dgt.length()){
            ans.add(curr);
            return;
        }
        String s=get(dgt.charAt(i));
        for(int j=0;j<s.length();j++){
            f(dgt,curr+s.charAt(j),i+1,ans);
        }
    }
    static String get(char ch){
        if(ch=='2'){
            return "abc";
        }else if(ch=='3'){
            return "def";
        }else if(ch=='4'){
            return "ghi";
        }else if(ch=='5'){
            return "jkl";
        }else if(ch=='6'){
            return "mno";
        }else if(ch=='7'){
            return "pqrs";
        }else if(ch=='8'){
            return "tuv";
        }else if(ch=='9'){
            return "wxyz";
        }else{
            return "";
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        f(digits,"",0,ans);
        return ans;
    }
}