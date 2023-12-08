package temp.Arrays;

import java.util.Arrays;

public class NextPermutations {
    public static void main(String[] args) {
        int [] nums = {1,3,2};
//        int [] nums = {2,1,5,4,3,0,0};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        if(nums.length <= 1 ) return;
        int i = nums.length - 2;
        int j = nums.length - 1;

        while(i >= 0 && nums[i] >= nums[i+1]) i--;


        if(i >= 0 ){
            while(j >= i && nums[j] <= nums[i]) j--;
            swap(nums, i , j);
        }
        reverse(nums, i+1,nums.length - 1);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int [] arr, int i,int j){
        while(i < j) swap(arr,i++,j--);
    }

}