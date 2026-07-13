/*
 * Problem: Separate the Digits in an Array
 * Problem ID: 2639
 * Difficulty: Easy
 * Language: Java
 * Runtime: 7 ms
 * Memory: 46.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-13
 */

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s=String.valueOf(nums[i]);
            for(char c:s.toCharArray()){
                l.add(c-'0');
            }
                     
        }
        int[] result = new int[l.size()];

        for (int i = 0; i < l.size(); i++) {
            result[i] = l.get(i);
        }
        return result;
    }
}