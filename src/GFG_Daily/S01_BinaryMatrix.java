package GFG_Daily;

import java.util.Arrays;

// problem : https://practice.geeksforgeeks.org/problems/77e1c3e12cd148f835d53eb168d4472b2ff539fa/1
public class S01_BinaryMatrix {

    public static void main(String [] args ){
        int mat[][] = { {1,1,1},
                        {1,1,0},
                        {0,0,0},
                        {1,1,1}};
        System.out.println(Arrays.toString(findMaxRow(mat,3)));
        System.out.println(Arrays.toString(findMaxRow2(mat,3)));
    }
    public static int[] findMaxRow(int mat[][], int N) {
        // code here
        int [] ans = new int[2];
        int max = -1;

        int lastRow = -1;
        int row = -1;

        for(int i = 0; i < mat.length; i++){
        int curMax = 0;
            for (int j = 0; j < mat[0].length; j++){
                if(mat[i][j] != 0){
                    curMax++;
                }
            }
            if(curMax  > max){
                max = curMax;
                lastRow = i;
            }
            if(curMax == max ){
                row = lastRow;
            }
        }
        ans[0] = row;
        ans[1] = max;
        return ans;
    }

    // second approach
    public static int [] findMaxRow2(int [][] mat, int N){

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if(mat[j][i] == 1 ) return new int[]{j,N-j};
            }
        }
        return new int[] {0,0};
    }
}