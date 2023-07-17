package Striver_Sheet.Arrays_.Part_03;

public class MajorityElement {
    public static void main(String[] args) {
        int []a = {1,2,3,4,4,4,4};
    }
    public int majorityElement(int[] nums) {
        int count = 0, elment = 0;
        for(int e : nums){
            if(count == 0) elment = e;
            if(e == elment) count++;
            else count--;
        }
        return elment;
    }
}