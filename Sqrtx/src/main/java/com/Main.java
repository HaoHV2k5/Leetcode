package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // cach 1 :
    public int mySqrt1(int x) {
        int ans = 0;
        for(int i = 1 ; i<= x ;i++){
            if((long)i * i > x){
                break;
            }
            ans = i;
        }
        return ans;
    }

    // cach 2

    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int l =1;
        int r = x;
        int ans = 1;
        while(l <= r){
            int mid = l + (r - l) /2;
            long square = (long) mid * mid;
            if(square == x) return mid;
            else if( square < x){


                l = mid +1;
                ans = mid;
            }
            else {
                r = mid -1;
            }
        }
        return ans;
    }
    static void main() {

    }
}
