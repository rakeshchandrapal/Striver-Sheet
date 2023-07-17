package DSA_Practice.Sorting.Advance;

import java.util.Arrays;

public class h {

    public static void main(String[] args) {
        int [] arr = {7,8,2,3,1,4};

        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
   static void merge(int arr[], int l, int m, int r)
    {
        // Your code here

        int [] merge = new int [r -l + 1];

        int idx1 = l;
        int idx2 = m + 1;
        int x = 0;

        while(idx1 <= m && idx2 <= r){
            if(arr[idx1] <= arr[idx2]){
                merge[x++] = arr[idx1++];
            }
            else{
                merge[x++] = arr[idx2++];
            }
        }

        while(idx1<= m ){
            merge[x++] = arr[idx1++];
        }

        while(idx2 <= r){
            merge[x++] = arr[idx2++];
        }

        for(int i = 0, j =l ; i < merge.length; i++, j++){
            arr[j] = merge[i];
        }
    }
    static void mergeSort(int arr[], int l, int r)
    {
        //code here

        if(l >= r){
            return ;
        }
        int mid = l + (r - l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1 , r);

        merge(arr, l , mid, r);
    }
}