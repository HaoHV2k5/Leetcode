package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int removeElement(int[] nums, int val) {
        int len =  nums.length;
        int pre = -1;
        for (int i= 0 ;i< len ; i++ ){
            if(nums[i] == val){
                continue;
            }
            pre+=1;
            nums[pre] = nums[i];
        }
        return pre+1;
    }


    static void main() {

    }
}
