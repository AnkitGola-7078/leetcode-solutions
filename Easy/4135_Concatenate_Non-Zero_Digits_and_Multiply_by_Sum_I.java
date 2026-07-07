/*
 * Problem: Concatenate Non-Zero Digits and Multiply by Sum I
 * Problem ID: 4135
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 42.9 MB
 * Synced From: LeetCode
 * Date: 2026-07-07
 */

class Solution {
    public long sumAndMultiply(int n) {

        String str = String.valueOf(n);
        int c=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!='0'){
                c++;
            }
        }

        int[] arr = new int[c];
        int j=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!='0'){
                arr[j]=str.charAt(i)-'0';
                j++;
            }
        }

        long remove_zero = 0;
        for (int i = 0; i < arr.length; i++) {
            remove_zero = remove_zero * 10 + arr[i];
        }

        
        long s=0;
        for (int i = 0; i < arr.length; i++) {
            s+=arr[i];
        }
        return s*remove_zero;
    }
}