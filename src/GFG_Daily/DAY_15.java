package GFG_Daily;

public class DAY_15 {
    public static void main(String[] args) {

    }

    static long countSubarrays(long n) {
        return n * (n + 1) / 2;
    }

    static long countSubarrays(int a[], int n, int L, int R) {
        long result = 0;
        long small = 0, smallerToR = 0;
        for (int e : a) {
            if (e > R) {
                result += countSubarrays(smallerToR) - countSubarrays(small);
                small = 0;
                smallerToR = 0;
            } else if (e < L) {
                small++;
                smallerToR++;

            } else {
                result -= countSubarrays(small);
                small = 0;
                smallerToR++;
            }
        }
        result += countSubarrays(smallerToR) - countSubarrays(small);
        return result;
    }
}