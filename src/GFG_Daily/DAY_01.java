//    https://practice.geeksforgeeks.org/problems/d25f415de2ff3e02134de03e17ad019d723ab2e9/1
package GFG_Daily;

import java.util.ArrayDeque;
import java.util.Stack;

public class DAY_01
{

    public static void main(String[] args )
    {
        String  S = "abppprrr";
        int X = 5;
        int Y = 4;
        System.out.println(solve(X,Y,S));

    }

    static long solve(int X,int Y, String S)
    {
        // code here
        long ans;
        if(X<Y) {
            ans = f(Y,X,S,'r','p');
        } else {
            ans = f(X,Y,S,'p','r');
        }
        return ans;
    }

    public static long f(long x,long y,String s,char c1,char c2) {
        Stack<Character> st = new Stack<>();
        long ans=0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c==c2) {
                if(st.size()>0 && st.peek()==c1) {
                    st.pop();
                    ans+=x;
                } else {
                    st.push(c);
                }
            } else {
                st.push(c);
            }
        }

        Stack<Character> st1 = new Stack<>();
        while(st.size()>0) {
            if(st.peek()==c2) {
                if(st1.size()>0 && st1.peek()==c1) {
                    ans+=y;
                    st1.pop();
                    st.pop();
                } else {
                    st1.push(st.pop());
                }
            } else {
                st1.push(st.pop());
            }
        }
        return ans;
    }

}