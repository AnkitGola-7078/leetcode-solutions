/*
 * Problem: Largest Number
 * Problem ID: 179
 * Difficulty: Medium
 * Language: Java
 * Runtime: 6 ms
 * Memory: 45.2 MB
 * Synced From: LeetCode
 * Date: 2026-07-06
 */

class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];

        // Convert to string array
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        //Agar a+b > b+a → to a ko pehle rakho.
        //Agar b+a > a+b → to b ko pehle rakho.
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        if (arr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : arr) sb.append(s);
        return sb.toString();
    }
}