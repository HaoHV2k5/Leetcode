package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r =0;
        for(int w : weights){
            l = Math.max(l, w);
            r+=w;
        }
        while(l < r){
            int mid = l + (r- l )/2;
            if(canShip(weights, days,mid)){
                r = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return l;

    }
    public static boolean canShip(int[] weights, int days, int capacity){
        int load = 0;
        int check = 1;
        for(int w : weights){
            if(load + w > capacity){
                check++;
                load = w;
            }
            else{
                load+=w;
            }
        }
        return check <= days;
    }


    static void main() {

    }
}
