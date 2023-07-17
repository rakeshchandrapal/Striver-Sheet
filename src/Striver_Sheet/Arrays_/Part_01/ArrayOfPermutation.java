package Striver_Sheet.Arrays_.Part_01;

import java.util.Arrays;

public class ArrayOfPermutation {
    public static  void nextPermutation(int[] arr) {

        if(arr.length <= 1) return;

        int i = arr.length - 2;
        while(i >= 0 && arr[i] >= arr[i+1]) i--;
        int j = arr.length - 1;
        if(i >= 0){
            while(j >= 0 && arr[j] <= arr[i]) j--;
            swap(arr,i,j);
        }
        reverse(arr,i+1, arr.length - 1);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int [] arr, int i,int j){
        while(i < j) swap(arr,i++,j--);
    }

    public static void main(String[] args) {
        int [] n = {3,2,1};
        nextPermutation(n);
        System.out.println(Arrays.toString(n));
    }
}