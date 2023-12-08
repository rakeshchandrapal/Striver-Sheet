package temp.Arrays;

import java.util.Arrays;

public class setMatrixZero {
    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 2, 2, 4},
                {1, 0, 1, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 0}};

        int[][] mat = {{1}, {0}, {3},};
        setZeroes(mat);

        for (int[] e : mat) {
            System.out.println(Arrays.toString(e));
        }
    }

    public static void setZeroes(int[][] matrix) {
        boolean isRowZero = false;
        boolean isColZero = false;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < col; i++) {
            if (matrix[0][i] == 0) {
                isRowZero = true;
                break;
            }
        }

        for (int j = 0; j < row; j++) {
            if (matrix[j][0] == 0) {
                isColZero = true;
                break;
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for (int i = row - 1; i >= 1; i--) {
            for (int j = col - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 | matrix[0][j] == 0) matrix[i][j] = 0;
            }
        }

        if (isRowZero) {
            for (int i = 0; i < col; i++) {
                matrix[0][i] = 0;
            }
        }

        if (isColZero) {
            for (int j = 0; j < row; j++) {
                matrix[j][0] = 0;
            }
        }


    }
}