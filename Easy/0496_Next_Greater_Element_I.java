/*
 * Problem: Next Greater Element I
 * Problem ID: 496
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms
 * Memory: 45.5 MB
 * Synced From: LeetCode
 * Date: 2026-07-14
 */

class Solution {
        public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); 
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}