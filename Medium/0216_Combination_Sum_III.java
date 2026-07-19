/*
 * Problem: Combination Sum III
 * Problem ID: 216
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.1 MB
 * Synced From: LeetCode
 * Date: 2026-07-19
 */

class Solution {
    public static void com3(int i,int k,int n, List<List<Integer>> ans,ArrayList<Integer> sub){
        if(n==0 && sub.size()==k){
          ans.add(new ArrayList<>(sub));
          return;
        }
         if (n < 0 || sub.size() > k) return;

        for(int j=i;j<=9;j++){
            sub.add(j);
            com3(j+1,k,n-j,ans,sub);
            sub.remove(sub.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> sub=new ArrayList<>();
        com3(1,k,n,ans,sub);
        return  ans;
    }
}