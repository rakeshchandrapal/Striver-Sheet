package Arrays_.Part_02;

import java.util.Arrays;

public class mergeTwoSortedArray {

    public static void main(String[] args) {
        int []a = {1,2,3,0,0,0};
        int [] b = {2,5,6};
        merge(a,3,b,3);
        System.out.println(Arrays.toString(a));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]){
                nums1[index--] = nums1[i--];
            }
            else{
                nums1[index--] = nums2[j--];
            }
        }

    }
}