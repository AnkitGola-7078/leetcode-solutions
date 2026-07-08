/*
 * Problem: Generate Parentheses
 * Problem ID: 22
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms
 * Memory: 43.4 MB
 * Synced From: LeetCode
 * Date: 2026-07-08
 */

class Solution {
    public static void sol(int n,int ob,int cb,String ans, List<String> l)
	{
		if(ob>n/2)return;
		if(ob+cb==n)
		{
			l.add(ans);
			return;
		}
		if(cb>ob)return;
		
		sol(n,ob+1,cb,ans+"(",l);
		sol(n,ob,cb+1,ans+")",l);
		
		
	}
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        sol(n*2,0,0,"",l);
        return l;
    }
}