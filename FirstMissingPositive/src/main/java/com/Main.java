package com;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
 // c1
    public int firstMissingPositive(int[] nums) {
        int minNumber = 1;
        Arrays.sort(nums);
        for(int i : nums){
            if(i < 0) continue;
            if(minNumber < i ){
                continue;
            }
            else  {
                minNumber = i+1;
            }

        }
        return minNumber;
    }

    static void main() {

    }
}
