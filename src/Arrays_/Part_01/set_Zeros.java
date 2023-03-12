package Arrays_.Part_01;

import java.util.Arrays;
import java.util.HashSet;

public class set_Zeros {
    public static void main(String[] args) {

        int[][] m  = {   {2,1,2,0},
                         {3,4,5,2},
                         {1,3,1,5}
        };
        setZeroesOptimized(m);
        for(int []x : m){
            System.out.println(Arrays.toString(x));
        }
    }

    public static void setZeroesOptimized(int[][] matrix) {
        boolean col0 = false;
        int row = matrix.length, col = matrix[0].length;

        for(int i = 0; i < row; i++){
            if(matrix[i][0] == 0) col0 = true;
            for(int j = 1; j < col; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = matrix[0][j]  = 0;
                }
            }
        }
        System.out.println(col0);

        for(int i = row - 1; i >= 0; i--){
            for(int j = col - 1; j >= 1; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            if(col0) matrix[i][0] = 0;
            }
        }
    }


    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        HashSet<Integer> r = new HashSet<>();
        HashSet<Integer> c = new HashSet<>();
        for(int i = 0; i < row;i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == 0){
                    r.add(i);
                    c.add(j);
                }
            }
        }

        for(Integer em : r){
            setRow(matrix,em,col);
        }

        for(Integer em : c){
            setCol(matrix,em,row);
        }
        return;
    }

    public static void setRow(int[][] arr,int r, int rowlen){
        for(int i = 0; i < rowlen; i++){
            arr[r][i] = 0;
        }
    }

    public static void setCol(int[][] arr,int c,int colLen){
        for(int i = 0; i < colLen; i++){
            arr[i][c] = 0;
        }
    }


}