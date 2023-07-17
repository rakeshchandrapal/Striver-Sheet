package DSA_Practice.Sorting.Basics;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {8,5,3,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Time Complexity : O(n^2)
     static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1 ; i++){
            int min = i;
            for(int j = i + 1; j <arr.length ; j++ ){
                if(arr[j] < arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}