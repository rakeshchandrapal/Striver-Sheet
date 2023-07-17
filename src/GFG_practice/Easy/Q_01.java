package GFG_practice.Easy;

import java.util.ArrayList;

public class Q_01 {
    public static void main(String[] args) {
        int n = 5,s = 12;
        int [] a = {1,2,3,7,5};
        System.out.println(subarraySum(a,n,s));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> ans = new ArrayList<>();
        if( s == 0 || n < 2){
            ans.add(-1);
            return ans;
        }

        int start = 0;
        int curSum = 0;

        for(int i = 0; i <= n; i++){

            while(curSum > s && start < i- 1){
                curSum -= arr[start];
                start++;
            }

            if(curSum == s){
                ans.add(start+1);
                ans.add(i);
                return ans;
            }

          if(i < n)  curSum += arr[i];
        }

        ans.add(-1);
        return ans;
    }

}