package Striver_Sheet.Arrays_.Part_02;

import java.util.Arrays;

public class rotateMatrix {
    public static void rotate(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        for(int i = 0; i < row; i++){
            for(int j = i; j < col; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            }
        for(int[] x :arr ){
            int i = 0,j = x.length-1;
            while (i < j){
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
                i++;
                j--;
            }
        }
        return;
}





    public static void main(String[] args) {
        int[][] a = { {1,2,3},
                      {4,5,6},
                      {7,8,9}
        };
        rotate(a);
        System.out.println();
       for(int[] x : a){
             System.out.println(Arrays.toString(x));
        }
    }





}