package GFG_Daily;

import java.awt.*;
import java.util.*;

public class Day_10 {
    public static void main(String[] args) {
        String a = "abccabd";
        System.out.println(FirstNonRepeating(a));
    }
    public  static String FirstNonRepeating(String A)
    {
        StringBuilder ans = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        Queue<Character> queue =new ArrayDeque<>();

        for(int i=0; i < A.length(); i++){
            Character cur = A.charAt(i);

            if(map.containsKey(cur)){
                int o = map.get(cur);
                map.put(cur, o+1);
            }
            else{
                map.put(cur, 1);
                queue.add(cur);
            }

            while(!queue.isEmpty() && map.get(queue.peek()) > 1) queue.remove();
            if(queue.isEmpty()) ans.append('#');
            else ans.append(queue.peek());

        }
        return ans.toString();
    }
}