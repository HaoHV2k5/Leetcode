package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int len = nums.length;
        ans[0] = 1;
        for(int i=1; i< len; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int temp = 1;
        for(int i = len -1; i>=0; i--){
            ans[i] = temp * ans[i];
            temp*= nums[i];
        }
        return ans;
    }

    static void main() {

    }
}
