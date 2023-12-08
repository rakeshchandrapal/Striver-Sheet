package GFG_practice.Basics;

import java.util.*;

public class Q_01 {

    public static void main(String[] args) {
        int n = 7, k = 2;
        int[] a = {1,7,4,3,4,2,7,5};
        System.out.println(firstElementKTime(a,n,k));
    }
    public static int firstElementKTime(int[] a, int n, int k) {

        Map<Integer, Integer> map  = new HashMap<>();
        for(int e : a){
            if(map.containsKey(e)){
                int temp = map.get(e);
                map.put(e,temp+1);
            }
            else {
                map.put(e, 1);
            }
            if(map.get(e) == k) return e;

        }

        return -1;
    }
}