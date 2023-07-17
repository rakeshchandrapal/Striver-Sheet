package DSA_Practice.Sorting.Advance;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
            int [] arr = {10,80,30,90,40};
            quickSorting(arr, 0,arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSorting(int []arr, int low , int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);

            quickSorting(arr, low,pivotIndex-1);
            quickSorting(arr, pivotIndex+1 , high);
        }
    }

    public static int  partition(int [] arr , int low, int high ){
        int pivot = arr[high];
        int i = low -1;

        for(int j = low ; j < high ; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;
        return i;
    }
}