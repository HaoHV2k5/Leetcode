package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int maxArea(int[] height) {
        int max = -1;
        int l = 0 ;
        int r = height.length -1;
        while(l< r){
            int dis = r - l;
            int col = Math.min(height[l], height[r]);
            max = Math.max(col * dis, max);
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return max;
    }

    static void main() {

    }
}
