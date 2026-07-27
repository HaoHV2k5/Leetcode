package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int guess(int a){
        return a;
    }

    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        while(l <= r){
            int mid = l +(r-l)/2;
            int check = guess(mid);
            if(check == 0){
                return mid;
            }
            else if(check == 1){
                l = mid +1;
            }
            else{
                r = mid -1;
            }
        }
        return 0;

    }

    static void main() {

    }
}
