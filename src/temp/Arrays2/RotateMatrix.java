package temp.Arrays2;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(a);
        System.out.println();
        for (int[] x : a) {
            System.out.println(Arrays.toString(x));
        }
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int[] e : matrix) {
            reverse(e);
        }


    }

    public static void reverse(int[] mat) {
        int i = 0;
        int j = mat.length - 1;
        while (i < j) {
            int temp = mat[i];
            mat[i] = mat[j];
            mat[j] = temp;
            i++;
            j--;
        }
    }
}