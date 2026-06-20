package com;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i=0; i < len; i++){
            int number = target - nums[i];
            if(map.containsKey(number)){
                return new int[]{map.get(number), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    static void main() {

    }
}
