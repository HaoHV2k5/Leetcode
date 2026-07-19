package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < len - 3; i++){
            if( i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+ 1; j < len -2  ; j++){

                int l = j + 1;
                int r = len - 1;
                while(l < r){

                    long sum = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum == target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        l++;
                        r--;
                        while(nums[l] == nums[l-1] && l < r) l++;
                        while(nums[r] == nums[r+1] && l < r) r--;
                        while(nums[j] == nums[j+1] && j < len-2) j++;

                    }
                    else if(sum < target){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
        return res;
    }
    static void main() {

    }
}
