/*
 * Problem: Combination Sum
 * Problem ID: 39
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms
 * Memory: 46 MB
 * Synced From: LeetCode
 * Date: 2026-07-19
 */

class Solution {
    static void com(int i,int t,int c[], List<List<Integer>> res ,ArrayList<Integer> subset){
        if(t<0||i<0) return;
        if(t==0){
           res.add(new ArrayList<>(subset));
           return;
        }
       subset.add(c[i]);
       com(i,t-c[i],c,res,subset);//includ
       subset.remove(subset.size() - 1);//backtrack
       com(i-1,t,c,res,subset);//exclude
    }
    public List<List<Integer>> combinationSum(int[] c, int target) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        Arrays.sort(c);
        com(c.length-1,target,c, res, subset);
        return res;
    }
}