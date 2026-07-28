package com;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static boolean eat(int[] p, int h, int k){
        int time  = 0;
        for(int num : p ){
            time += (num + k - 1) / k; // 2
            if(time > h ) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int len  = piles.length;
        int r = piles[len -1];
        int l = 1;
        int ans = -1;
        while(l <= r){
            int mid  = l + (r-l)/2;
            boolean check = eat(piles, h, mid);
            if(check){
                ans = mid;
                r = mid -1; // 1 5 => mid = 3
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
    static void main() {

    }
}
