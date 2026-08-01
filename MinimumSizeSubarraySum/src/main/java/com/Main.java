package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int l = 0;
        int len = nums.length;
        int ans = len + 1;

        for(int r = 0; r < len ; r++){
            sum+= nums[r];
            while(sum >= target){
                ans = Math.min(ans, r - l + 1);
                sum-= nums[l]; //
                l++;
            }
        }
        return ans == len + 1? 0 : ans;
    }


    static void main() {

    }
}
