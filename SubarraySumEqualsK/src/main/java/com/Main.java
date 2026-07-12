package com;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int subarraySum(int[] nums, int k) {

        int ans = 0;


        for(int i = 1 ; i< nums.length; i++){
            nums[i] += nums[i-1];
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0 ; i< nums.length ; i++){
            int temp = nums[i] - k;
            if(map.containsKey(temp) ){
                ans+= map.get(temp);
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }

            else{
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }


        }
        return ans;

    }
    static void main() {
        int[] nums = {1,2,3};
        int k = 3;

    }
}
