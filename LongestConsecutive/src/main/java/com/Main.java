package com;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int len = 1;
        int current = 1;

        for(int i = 1; i< nums.length ; i++ ){
            if(nums[i-1] == nums[i]) continue;
            else if(nums[i] - nums[i-1] == 1 ){
                current ++;
            }
            else{
                len = Math.max(len, current);
                current = 1;
            }
        }
        len = Math.max(len, current);
        return len;
    }
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}
