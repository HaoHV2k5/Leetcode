package com;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] arr = new int[n][2];

        for(int i = 0 ; i< n; i ++){

            arr[i][0] = position[i];
            arr[i][1] = speed[i];

        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        int ans = 0;
        double maxTime = 0;
        for(int i = 0 ; i< n ; i++){
            double time = (double) (target - arr[i][0]) / arr[i][1];

            if(time > maxTime){
                ans++;
            }
            maxTime = Math.max(maxTime, time);

        }
        return ans;
    }
    static void main() {


    }
}
