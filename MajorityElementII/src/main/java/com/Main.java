package com;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public List<Integer> majorityElement(int[] nums) {
        int number1 = 0;
        int count1 =0;
        int  number2 = 0 ;
        int count2 = 0;
        for (int num : nums){
            if(num == number1){
                count1++;
            }
            else if(num == number2){
                count2++;
            }
            else if(count1 == 0 ){
                number1 = num;
                count1 = 1;
            }
            else if(count2 == 0){
                number2 = num;
                count2 = 1;
            }
            else{
                count1 --;
                count2 --;
            }
        }
        count1 = count2 = 0;
        for(int num : nums){
            if(num == number1){
                count1++;
            }
            else if(num == number2){
                count2++;
            }
        }
        List<Integer> list = new ArrayList<>();
        int limited = nums.length / 3;
        if(count1 > limited) list.add(number1);
        if(count2 > limited) list.add(number2);
        return list;
    }
    static void main() {

    }
}
