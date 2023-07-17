package GFG_Daily;

public class Day_06 {
    public static void main(String[] args) {
        int [] arr = {0,-10,1,3,-20};
        System.out.println(missingNumber(arr, arr.length));
    }
    static int missingNumber(int arr[], int size)
    {
        // Your code here

        int sumOfN ;
        int sum = 0;
        int max = -1;

        for(int e : arr){
            if(e > 0){
                if(e > max) max = e;
                sum += e;
            }
        }
        if (sum == 0 ) return 0;
        sumOfN = max * (max + 1)/2;
        if(sumOfN - sum == 0) return max+1;
        return sumOfN - sum;
    }
}