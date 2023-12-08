package GFG_Daily;

import java.util.ArrayList;

public class DAY_13 {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++)
                    answer.add(matrix[i][j]);

            } else {
                for (int j = cols -1; j >= 0; j--)
                    answer.add(matrix[i][j]);

            }
        }
        return answer;
    }
}