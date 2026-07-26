/*
 * Problem: Target Sum
 * Problem ID: 494
 * Difficulty: Medium
 * Language: Java
 * Runtime: 106 ms
 * Memory: 47.5 MB
 * Synced From: LeetCode
 * Date: 2026-07-26
 */

class Solution {
    static int f(int[] nums,int t,int s,int i,Map<String,Integer> dp){
        
        if(i==nums.length){
            return (t==s)?1:0;
        }
        String key=i+","+s;
        if(dp.containsKey(key)) return dp.get(key);
        int ans=f(nums,t,s+nums[i],i+1,dp)+f(nums,t,s-nums[i],i+1,dp);
        dp.put(key,ans);
        return ans;
        
    }
    public int findTargetSumWays(int[] nums, int target) {
        Map<String,Integer> dp=new HashMap<>();
        return f(nums,target,0,0,dp);

    }
}