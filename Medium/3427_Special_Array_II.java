/*
 * Problem: Special Array II
 * Problem ID: 3427
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms
 * Memory: 120.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-13
 */

class Solution {
    // public boolean[] isArraySpecial(int[] nums, int[][] quer) {
    //     boolean[] ans=new boolean[quer.length];
    //     for(int i=0;i<quer.length;i++){
    //         int from=quer[i][0];
    //         int to=quer[i][1];
    //         boolean f=true;
    //         for(int j=from+1;j<=to;j++){
    //             if((nums[j]+nums[j-1])%2==0){
    //                 f=false;
    //                 break;
    //             }
    //         }
    //         ans[i]=f;
    //     }
    //     return ans;
    // }

    public boolean[] isArraySpecial(int[] nums, int[][] quer) {
    int n = nums.length;
    int[] pref = new int[n];
    // ek loop: clashes mark + prefix sum
    for(int i=1;i<n;i++){
        pref[i] = pref[i-1];
        if((nums[i]+nums[i-1])%2==0){
            pref[i]++;
        }
    }

    boolean[] ans = new boolean[quer.length];
    for(int i=0;i<quer.length;i++){
        int from = quer[i][0];
        int to   = quer[i][1];
        ans[i] = (pref[to] - pref[from]) == 0;
    }
    return ans;
}

}