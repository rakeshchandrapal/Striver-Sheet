package Striver_Sheet.Arrays_.Part_03;

public class reverseInPairs {

    public static void main(String[] args){
//        int [] nums = {1,3,2,3,1};
        int [] nums = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(reversePairs(nums));

    }

    public static  int reversePairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length ; j++){
                if(i<j){
                    if(nums[i] > 2* nums[j]) count++;
             }
            }
        }
        return count;
    }
}