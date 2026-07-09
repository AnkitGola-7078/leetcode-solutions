/*
 * Problem: Maximum Points You Can Obtain from Cards
 * Problem ID: 1538
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms
 * Memory: 61.8 MB
 * Synced From: LeetCode
 * Date: 2026-07-09
 */

class Solution {
    public int maxScore(int[] card, int k) {
        int t=0;
        for(int i=0;i<k;i++){
            t+=card[i];
        }
        
         int l=k-1;
         int r=card.length-1;
         int windows=t;
         int best=t;
        while(l>=0){
            windows+=card[r];
            windows-=card[l];
            best=Math.max(best,windows);
            l--;
            r--;
    
        }
         return best;
    
    }
}
    
