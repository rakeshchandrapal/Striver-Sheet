package GFG_Daily;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DAY_07 {
    public static void main(String[] args) {
        int []a = {2, 2, 5, 10, 1, 2, 10, 5, 10, 10,2};
        System.out.println(isFrequencyUnique(a.length, a));
    }
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        Arrays.sort(arr);
        if(arr.length == 1) return true;
        int cur = arr[0];
        int count = 1;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 1; i < arr.length; i++){
            if(cur == arr[i]){
                count++;
            }
            else{
                if(set.contains(count) ){
                    return false;
                }
                else{
                    set.add(count);
                    count = 1;
                    cur = arr[i];
                }
            }
        }
        return !set.contains(count);
    }
}