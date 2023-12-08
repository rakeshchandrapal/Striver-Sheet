package temp.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascals {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        int[][] dp = new int[numRows][numRows];
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                }
                temp.add(dp[i][j]);
            }
            ans.add(temp);
        }
        return ans;
    }
}