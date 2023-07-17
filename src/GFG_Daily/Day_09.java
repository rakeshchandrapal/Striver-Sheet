package GFG_Daily;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day_09 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(rev(q));
    }
    public static Queue<Integer> rev(Queue<Integer> q){
        Queue<Integer> res = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.add(q.remove());
        }
        while(!st.isEmpty()){
            res.add(st.pop());
        }

        return res;
    }

}