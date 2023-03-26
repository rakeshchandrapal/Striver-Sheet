package GFG_Daily;

public class DAY_03 {

    public static void main(String [] args){
        String s = "abab";
        System.out.println(removeReverse(s));
    }
   static String removeReverse(String S)
   {
       int n = S.length();
       int[] freq = new int[26];
       for(char c : S.toCharArray()) freq[c-'a']++;

       int[] pos = new int[26];
       boolean front = true;

       int i = 0, j = n-1;

       while(i <= j){
           if(front){
              int element = S.charAt(i)-'a';
              if(freq[element] > 1) front = false;
              if(freq[element] == 1) pos[element] = i;
              freq[element]--;
              i++;
           }
           else {
               int element = S.charAt(j) - 'a';
               if(freq[element] > 1) front = true;
               if(freq[element] == 1) pos[element] = j;
               freq[element]--;
               j--;
           }
       }

       StringBuilder ans = new StringBuilder();
       for(int k = 0; k < n; k++ ){
           int element  = S.charAt(k) - 'a';
           if(pos[element] == k) ans.append(S.charAt(k));
       }

       if(front) return ans.toString();
       return ans.reverse().toString();
   }



}