/*
 * Problem: Distribute Elements Into Two Arrays I
 * Problem ID: 3347
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 46.5 MB
 * Synced From: LeetCode
 * Date: 2026-08-20
 */

class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];

        int size1 = 1;
        int size2 = 1;

        arr1[0] = nums[0];

        arr2[0] = nums[1];

        for (int i = 2; i < nums.length; i++) {
            if (arr1[size1 - 1] > arr2[size2 - 1]) {
                arr1[size1++] = nums[i];
            } else {
                arr2[size2++] = nums[i];
            }
        }

        int[] result = new int[nums.length];

        System.arraycopy(arr1, 0, result, 0, size1);

        System.arraycopy(arr2, 0, result, size1, size2);

        return result;
    }
}