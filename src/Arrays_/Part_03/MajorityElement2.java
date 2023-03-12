package Arrays_.Part_03;

import java.util.*;


public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int num1 = -1, num2 = -1;
        int c1 = 0,c2 = 0;

        for(int el : nums){
            if(el == num1) c1++;
            else if (el == num2) c2++;
            else if(c1 == 0){
                num1 = el;
                c1 = 1;
            }
            else if(c2 == 0){
                num2 = el;
                c2 = 1;
            }
            else{
                c1--;
                c2--;
            }
        }
        int n = nums.length ;
        c1 = 0; c2 = 0;
        for(int e : nums){
            if(e == num1)c1++;
            if(e == num2) c2++;
        }
        if(c1 > n/3) ans.add(num1);
        if(c2 > n/3) ans.add(num2);
        return ans;
    }
}