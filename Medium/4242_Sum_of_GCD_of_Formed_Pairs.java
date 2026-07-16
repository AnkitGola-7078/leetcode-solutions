/*
 * Problem: Sum of GCD of Formed Pairs
 * Problem ID: 4242
 * Difficulty: Medium
 * Language: Java
 * Runtime: 56 ms
 * Memory: 124.4 MB
 * Synced From: LeetCode
 * Date: 2026-07-16
 */

class Solution {
    static int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int p[]=new int[nums.length];
        int max=Integer.MIN_VALUE;
        for(int l=0;l<nums.length;l++){
            max=Math.max(max,nums[l]);
            p[l]=gcd(nums[l],max);
        }
        Arrays.sort(p);
        int i=0;
        int j=p.length-1;
        int ans[]=new int[p.length/2];
        while(i<j){

            ans[i]=gcd(p[i],p[j]);
            i++;
            j--;
        }
        long s=0;
        for(int k=0;k<ans.length;k++){
             s=s+ans[k];
        }
    return s;
        

        

    }
}