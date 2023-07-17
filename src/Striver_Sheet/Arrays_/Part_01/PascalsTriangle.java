package Striver_Sheet.Arrays_.Part_01;

import java.util.*;

public class PascalsTriangle {

    public static void main(String[] args) {
        List<List<Integer>> ans = generate(5);
        for(List<Integer> l: ans){
            System.out.println(l);
        }

    }
    public static List<List<Integer>> generate(int numRows) {
        int[][] dp= new int [numRows][numRows];
        int n = numRows;
        for(int i = 0; i < numRows; i++){
            dp[0][i] = dp[i][0] = 1;
        }
        int row = numRows;
        for(int i = 1; i < row; i++){
            numRows = numRows - 1;
            for(int j = 1; j < numRows;j++){
                dp[i][j] = dp[i - 1][j] + dp[i][j-1];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        int r = 0,c = 0;
        while(r < n){
            List<Integer> s = new ArrayList<>();
            int r2 = r;
            while(c < r + 1 ){
                s.add(dp[r2--][c++]);
            }
            ans.add(s);
            c = 0;
            r++;
        }
        return ans;
    }
}