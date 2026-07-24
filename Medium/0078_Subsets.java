/*
 * Problem: Subsets
 * Problem ID: 78
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 44 MB
 * Synced From: LeetCode
 * Date: 2026-07-24
 */

class Solution {
    static void f(int i,int arr[],List<Integer> l,List<List<Integer>> res){
        if(i==arr.length){
            res.add(new ArrayList<>(l));
            return;
        }
        l.add(arr[i]);
        f(i+1,arr,l,res);
        l.remove(l.size()-1);
        f(i+1,arr,l,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        f(0,nums,l,res);
        return res;
    }
}