package DSA_Practice.Sorting.Basics;

import java.util.Arrays;



public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {8,7,5,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void insertionSort(int[] arr) {
        for(int i = 1 ; i < arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j] ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
    // Time Complexity : O(n^2)
}