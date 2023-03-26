package GFG_Daily;

import java.util.Arrays;

public class DAY_04 {

    public static void main(String[] args) {
        int N = 3;
        int leaves = 6;
        int [] frogs = {1,3,5};
        System.out.println(unvisitedLeaves(N,leaves,frogs));
    }
    public static int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        boolean [] flag = new boolean[leaves+1];
        Arrays.fill(flag,false);

        for(int i = 0; i < N; i++){

            if(frogs[i]<= leaves && flag[frogs[i]] == false){
                for(int j = frogs[i]; j < leaves+1; j += frogs[i]){
                    flag[j] = true;

                }

            }
        }
        int ans = 0;
        for(int  i = 1; i < leaves+1; i++){
            if(!flag[i]) ans++;
        }
        return ans;
    }
}