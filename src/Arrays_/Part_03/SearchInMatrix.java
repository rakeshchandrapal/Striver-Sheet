package Arrays_.Part_03;

public class SearchInMatrix {

    public static void main(String[] args) {
//        int [][] arr = { {1,3,5,7},
//                {10,11,16,20},
//                {23,30,34,60}
//        };
        int [][]arr = {{3}};
        int target = 3;
        System.out.println(searchMatrix(arr,target));
    }
    public  static boolean searchMatrix(int[][] matrix, int target) {
            int row = matrix.length;
            int col = matrix[0].length;
            int i = 0, j = col - 1;

            while(i <  row && j >= 0){
                if(matrix[i][j] == target) return true;
                else if(target < matrix[i][j]) j--;
                else i++;
            }
            return false;
    }
}