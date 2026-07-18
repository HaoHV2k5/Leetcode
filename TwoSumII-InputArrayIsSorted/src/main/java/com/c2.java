package com;

public class c2 {
    public int[] twoSum(int[] numbers, int target) {

        int l = 0;
        int r = numbers.length -1;
        while(l < r){
            int temp = numbers[l] + numbers[r];
            if(temp > target){
                r--;
            }
            else if(temp < target){
                l++;
            }
            else if(temp == target){
                return new int[]{l+1,r+1};
            }

        }
        return new int[]{0,0};

    }
}
