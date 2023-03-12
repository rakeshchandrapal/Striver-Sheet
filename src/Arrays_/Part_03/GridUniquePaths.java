package Arrays_.Part_03;

import java.util.Arrays;

public class GridUniquePaths {
    public static void main(String[] args) {
        int m = 3, n = 2;
        System.out.println(uniquePaths(m,n));
    }

    public static  int uniquePaths1(int m, int n) {
        int[][] dp = new int [m][n];
        for(int[] e : dp){
            Arrays.fill(e,-1);
        }
        return uniquePathsHelper(m-1,n-1, dp);
    }

    private static int uniquePathsHelper(int m, int n, int dp[][]) {
        if(m < 0 || n < 0 ) return 0;
        if(m ==0 || n ==0 )  return 1;
        if(dp[m][n] != -1) return dp[m][n];
        else return dp[m][n] = uniquePathsHelper(m-1, n,dp) + uniquePathsHelper(m,n-1,dp);
    }

    // Optimal approach
    public static  int uniquePaths(int m, int n) {
        int N = m + n - 2;
        int r = n  - 1;
        double res = 1;

        for(int i = 1; i <= r; i++){
            res = res * (N - r + 1)/i;
        }
        return (int)res;
    }
}