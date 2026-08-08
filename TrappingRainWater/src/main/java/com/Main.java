package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int trap(int[] height) {
        int n = height.length;
        if(n < 3) return 0;
        int l = 0;
        int r = height.length -1;
        int sum = 0;
        int lMax = height[l];
        int rMax = height[r];

        while(l < r){
            if(lMax < rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                sum+= lMax - height[l];
            }
            else{
                r--;
                rMax = Math.max(rMax, height[r]);
                sum+= rMax - height[r];
            }
        }




        return sum;
    }
    static void main() {

    }
}
