/*
 * Problem: Find Lucky Integer in an Array
 * Problem ID: 1510
 * Difficulty: Easy
 * Language: Java
 * Runtime: 5 ms
 * Memory: 45.1 MB
 * Synced From: LeetCode
 * Date: 2026-07-04
 */

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }



        int ans=-1;
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
             if(e.getKey().equals(e.getValue())){
                ans= e.getKey();
             }
        }
        return ans;
    }
}