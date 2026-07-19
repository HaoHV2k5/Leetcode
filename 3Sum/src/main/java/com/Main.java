package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < len - 2; i ++){
            int l = i + 1;
            int r = len - 1;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            while(l < r){
                int sum = nums[l] + nums[i] + nums[r];
                if(sum == 0){

                    res.add(Arrays.asList(nums[l],nums[i],nums[r]));
                    l++;
                    r--;
                    while(nums[l] == nums[l-1] && l < r){
                        l++;
                    }
                    while(nums[r] == nums[r+1] && l < r){
                        r--;
                    }
                } else if(sum < 0){
                    l++;
                }
                else{
                    r--;
                }
            }

        }
        return res;

    }
    static void main() {



    }
}
