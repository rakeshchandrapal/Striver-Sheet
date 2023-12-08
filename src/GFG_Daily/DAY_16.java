package GFG_Daily;

public class DAY_16 {

    public static void main(String[] args) {
        System.out.println(isPrime(11));
        int[] arr = {2, 4, 6, 8, 12};
        System.out.println(minNumber(arr, arr.length));
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static int minNumber(int[] arr, int N) {
        int answer = 0;
        for (int element : arr) {
            answer = answer + element;
        }
        for (int i = answer; i < Integer.MAX_VALUE; i++) {
            if (isPrime(i)) {
                answer = i - answer;
                break;
            }
        }
        return answer;
    }
}