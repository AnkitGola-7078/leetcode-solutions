/*
 * Problem: Rank Transform of an Array
 * Problem ID: 1256
 * Difficulty: Easy
 * Language: Java
 * Runtime: 30 ms
 * Memory: 76.2 MB
 * Synced From: LeetCode
 * Date: 2026-07-12
 */

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int a[]=arr.clone();
        HashMap<Integer,Integer> hp=new HashMap<>();
        int rank=1;
        Arrays.sort(a);
        for(int i:a){
            if(!hp.containsKey(i)){
                hp.put(i,rank++);
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=hp.get(arr[i]);
        }
        return arr;
    }
}