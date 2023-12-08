package GFG_Daily;

public class DAY_11 {
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(64));
    }

    public static boolean isPowerofTwo(long n) {
        if(n == 1) return true;
        int noOf1 = 0;
        String num = Long.toBinaryString(n);
        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) == '1')noOf1++;
        }
        System.out.println(num);
        return (noOf1 == 1);
    }
}