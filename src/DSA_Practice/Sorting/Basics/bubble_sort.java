package DSA_Practice.Sorting.Basics;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {8,5,3,7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Time Complexity : O(n^2)
    static void bubbleSort(int [] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0 ; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}