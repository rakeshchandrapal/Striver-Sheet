package Striver_Sheet.Arrays_.Part_01;

public class SortThree {

    public void sortColors(int[] arr) {
        int mid = 0, l = 0,r = arr.length-1;

        while(mid <= r){
            if(arr[mid] == 2){
                swap(arr,mid,r--);
            }
            else if(arr[mid] == 0){
                swap(arr,mid++,l++);
            }
            else mid++;
        }
        return;
    }

    public void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}