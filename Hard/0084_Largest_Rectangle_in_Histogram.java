/*
 * Problem: Largest Rectangle in Histogram
 * Problem ID: 84
 * Difficulty: Hard
 * Language: Java
 * Runtime: 69 ms
 * Memory: 78.3 MB
 * Synced From: LeetCode
 * Date: 2026-07-08
 */

import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;

        for(int i = 0; i <= n ; i++){
            int currHeight = (i == n) ? 0 : heights[i];
            while(!stack.isEmpty() && currHeight < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea , height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}