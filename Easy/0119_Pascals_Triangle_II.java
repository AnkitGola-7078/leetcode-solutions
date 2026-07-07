/*
 * Problem: Pascal's Triangle II
 * Problem ID: 119
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 42.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-07
 */

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 0; i < rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j < row.size(); j++) {
                newRow.add(row.get(j - 1) + row.get(j));
            }
            newRow.add(1);
            row = newRow;
        }

        return row;        
    }
}