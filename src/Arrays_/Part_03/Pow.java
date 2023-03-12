package Arrays_.Part_03;

public class Pow {
    public static void main(String[] args) {
        int n = 10;
        double x = 2.0;
        System.out.println(myPow(x,n));
    }
    public static double myPow(double x, int n) {

        double ans = 1.0;
        long nn = n;
        if(nn < 0) nn = nn * -1;

        while(nn > 0){
            if(nn % 2 == 0) {
                  x = x * x;
                  nn = nn / 2;
            }
            else {
                ans = ans * x;
                nn = nn - 1;
            }
        }
        if(n < 0) return (double) 1.0/(double) ans;
        return ans;
    }
}