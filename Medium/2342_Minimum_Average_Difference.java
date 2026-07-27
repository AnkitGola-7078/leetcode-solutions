/*
 * Problem: Minimum Average Difference
 * Problem ID: 2342
 * Difficulty: Medium
 * Language: Java
 * Runtime: 5 ms
 * Memory: 91.5 MB
 * Synced From: LeetCode
 * Date: 2026-07-27
 */

class Solution {
    public int minimumAverageDifference(int[] nums) {
        long totalsum=0;
        int n=nums.length;
        //calculate prefix sum nums = [2,5,3,9,5,3]-->[2,7,10,19,24,27]
        long pre[]=new long[nums.length];
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
            pre[i]=totalsum;
        }

        long min=Integer.MAX_VALUE;
        int ansidx=0;
        for(int i=0;i<n;i++){
            int dividepart=i+1;
            long firstpart=pre[i]/dividepart;

            long secpart=0;
            if((n-dividepart)!=0){
                 secpart=(totalsum-pre[i])/(n-dividepart);
            }

            long temp=Math.abs(firstpart-secpart);
            if(temp<min){
                min=temp;
                ansidx=i;
            }
        }
        return ansidx;
    }
}