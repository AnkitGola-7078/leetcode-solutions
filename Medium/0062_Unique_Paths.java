/*
 * Problem: Unique Paths
 * Problem ID: 62
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42 MB
 * Synced From: LeetCode
 * Date: 2026-07-04
 */

//recursive
/*class Solution {
    static int f(int m,int n,int r,int d){
        if(r==m ||d==n)return 0;
        if(r==m-1 && d==n-1)return 1;
        int right=f(m,n,r+1,d);
        int down=f(m,n,r,d+1);
        return (right+down);
    }
    public int uniquePaths(int m, int n) {
        return f(m,n,0,0);
    }
}*/


//recursive+dp

/*class Solution {
    static int f(int m,int n,int r,int d,int dp[][]){
        if(dp[r][d]!=-1) return dp[r][d];
        int right=f(m,n,r+1,d,dp);
        int down=f(m,n,r,d+1,dp);
        dp[r][d] =(right+down);
        return dp[r][d];
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }

        for(int i=0;i<n;i++){
            dp[m-1][i]=1;
        }

        for(int i=0;i<m;i++){
            dp[i][n-1]=1;
        }

        return f(m,n,0,0,dp);
    }
}*/

//bottom up
class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }

        for(int i=0;i<n;i++){
            dp[m-1][i]=1;
        }

        for(int i=0;i<m;i++){
            dp[i][n-1]=1;
        }

        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                dp[i][j]=dp[i+1][j]+dp[i][j+1];
            }
        }
        return dp[0][0];
    }
}

