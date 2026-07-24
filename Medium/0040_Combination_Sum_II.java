/*
 * Problem: Combination Sum II
 * Problem ID: 40
 * Difficulty: Medium
 * Language: Java
 * Runtime: 7 ms
 * Memory: 45.2 MB
 * Synced From: LeetCode
 * Date: 2026-07-24
 */

class Solution {
    public static void com(int i,int target,int[] arr, List<List<Integer>> res,ArrayList<Integer> subset){
        if(target<0) return;
        if(target==0){
            res.add(new ArrayList<>(subset));
            return;
        } 
        if (i == arr.length) return;

        // include arr[i]
        subset.add(arr[i]);
        com(i+1, target - arr[i], arr, res, subset);
        subset.remove(subset.size() - 1);
        // exclude arr[i]
        while (i+1 < arr.length && arr[i+1] == arr[i]) i++;
        com(i + 1, target, arr, res, subset);
        
    }
    public List<List<Integer>> combinationSum2(int[] c, int target) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        Arrays.sort(c);
        com(0,target,c, res, subset);
        return res;
    }
}