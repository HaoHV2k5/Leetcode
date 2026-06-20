package com;




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int[] getConcatenation(int[] nums) {
        int [] ans = new int[nums.length*2];

        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }


        return ans;
    }



    static void main() {



    }
}
