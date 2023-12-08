package GFG_Daily;

import java.util.ArrayList;

public class DAY_12 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2},
                {3, 4}};
        System.out.println(sumTriangles(mat, mat.length));
    }

    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int[][] matrix, int n) {
        int hi = 0;
        int lo = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                hi += matrix[i][j];
            }
            for (int j = 0; j <= i; j++) {
                lo += matrix[i][j];
            }
        }
        ans.add(hi);
        ans.add(lo);
        return ans;
        // code here
    }
}