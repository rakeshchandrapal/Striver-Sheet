package Striver_Sheet.Arrays_.Part_01;

public class maxSumSubArray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cur = 0;

        for(int e : nums){
            cur += e;
            if(cur > max) max = cur;
            if(cur < 0) cur = 0;
        }
        return max;
    }
}