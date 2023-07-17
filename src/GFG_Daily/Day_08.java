package GFG_Daily;

import java.util.ArrayDeque;
import java.util.Stack;

public class Day_08 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
//        s.push(50);

        deleteMid(s,s.size());
    }
    public static void deleteMid(Stack<Integer> s, int sizeOfStack){
        // code here
        int mid =( sizeOfStack + 1)/2;
        ArrayDeque<Integer> st = new ArrayDeque<>(mid);
        for(int i = 1 ; i<= mid; i++){
            st.push(s.pop());
        }
        if (0 == mid % 2) s.pop();
        else st.pop();
       while(!st.isEmpty()){
            s.push(st.pop());
        }
        System.out.println(s);
    }
}