package GFG_Daily;

import java.util.*;

public class DAY_05 {

    public static void main(String[] args) {
        int[] arr = {4, -16, 43, 4, 7, -36, 18};
        System.out.println(findTriplets(arr, arr.length));
    }

    public static boolean findTriplets(int[] arr, int n) {
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int low = i + 1;
            int high = n - 1;
            while (low < high) {
                int sum = arr[i] + arr[low] + arr[high];
                if (sum == 0) return true;
                else if (sum < 0) low++;
                else high--;
            }
        }
        return false;
    }
}