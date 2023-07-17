package Striver_Sheet.Arrays_.Part_02;
import java.util.*;

public class Merge_Interval {

    public static void main(String[] args) {
        int [][]a = {{1,3},{2,6},{8,10},{15,18}};
        int [][]ans = merge(a);

        for(int [] x : ans){
            System.out.println(Arrays.toString(x));
        }
    }
    public static int[][] merge(int[][] intervals) {

        if(intervals.length <= 1) return intervals;
//        Arrays.sort(intervals,(i1,i2) -> Integer.compare(i1[0],i2[0]));
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<int[]> ans =  new ArrayList<>();

        int [] newInterval = intervals[0];
        ans.add(newInterval);

        for(int [] x : intervals){
            if(x[0] <= newInterval[1]){
                newInterval[1] = Math.max(x[1],newInterval[1]);
            }
            else{
                newInterval = x;
                ans.add(newInterval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }


}