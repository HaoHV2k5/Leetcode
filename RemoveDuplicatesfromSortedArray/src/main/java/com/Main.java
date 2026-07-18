package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int removeDuplicates(int[] nums) {
        int k = 0;
        int cur = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[cur++] = nums[i];
            }
        }
        return cur;
    }

    static void main() {

    }
}
