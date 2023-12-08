package GFG_Daily;

import java.util.Arrays;

public class DAY_14 {
    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int tempMin = arr[0];
        int tempMax = arr[n - 1];

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) continue;
            tempMin = Math.min(arr[0] + k, arr[i] - k);
            tempMax = Math.max(arr[i-1] + k , arr[n -1] - k);
            ans = Math.min(ans, tempMax - tempMin);
        }
        return ans;
    }

    public static void main(String[] args) {


        int[] arr = {2, 4 ,3, 9, 9, 10 ,9, 7 ,1 ,2};
        int k = 4;
        System.out.println(getMinDiff(arr, arr.length, k));
    }
}