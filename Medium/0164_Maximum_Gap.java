/*
 * Problem: Maximum Gap
 * Problem ID: 164
 * Difficulty: Medium
 * Language: Java
 * Runtime: 46 ms
 * Memory: 90.9 MB
 * Synced From: LeetCode
 * Date: 2026-07-14
 */

class Solution {
    public int maximumGap(int[] nums) {
         Arrays.sort(nums);
        if(nums.length<1) return 0;
        int max=0;
       
        for(int i=1;i<nums.length;i++){
           
                int v=Math.abs(nums[i]-nums[i-1]);
                if(v>max){
                    max=v;
                }
            
        }
        return max;
        
    }
}