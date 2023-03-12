package Leetcode.Arrays_Practice;

import java.util.ArrayList;
import java.util.*;

public class L2011 {

    public static void main(String[] args) {
        int[][] ans = {{1,3},{2,6},{2,4},{8,10}};
        int [][] result = merge(ans);

        for(int [] E : result){
            System.out.println(Arrays.toString(E));
        }


        }
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for(String e : operations){
            if(e.charAt(0) == '+' || e.charAt(2) == '+') x++;
            else x--;
        }
        return x;
    }

//[[1,3],[2,6],[8,10],[15,18]]
    public static int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return  intervals;
        List<int[]> ans = new ArrayList<>();
        int [] cur = intervals[0];
        for(int[] e : intervals){
            if(cur[1] >= e[0]){
                cur[1] = Math.max(cur[1], e[1]);
            }
            else{
                ans.add(cur);
                cur = e;
            }
        }
        ans.add(cur);
        return ans.toArray(new int[ans.size()][]);
    }
    public int[] shuffle(int[] nums, int n) {
        if(nums.length <= 2) return  nums;
        int [] ans = new int [nums.length];
        int i = 0;
        int j = 1;
        for(int x = 0; x < n; x++){
            ans[i] = nums[x];
            ans[j] = nums[x+n];
            i += 2; j += 2;
        }
        return ans;
    }
}