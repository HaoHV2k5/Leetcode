package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // cach 1
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int point = nums.length / 2;
//        for(int i : nums){
//            if(map.containsKey(i)){
//                int index = map.get(i)+1;
//
//                map.put(i, index);
//
//            }
//            else{
//                map.put(i, 1);
//            }
//        }
//        int max = -1;
//        int key = -1;
//        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//            max = Math.max(max, entry.getValue());
//            if(max == entry.getValue()){
//                key = entry.getKey();
//            }
//        }
//        return  key;
//    }

    // cach 2

    public int majorityElement(int[] nums) {
        int len = nums.length;
        if(len == 1) return nums[0];
        Arrays.sort(nums);
        int size = 1;
        int maxSize = 1;
        int key = nums[0];
        int cur = nums[0];
        for(int i = 1; i< len; i++){
            if(nums[i] == cur){
                size+=1;
            }
            else{
                maxSize = Math.max(size, maxSize);
                if(maxSize == size){
                    key = cur;

                }
                size = 1;
                cur = nums[i];
            }
            if(size >= maxSize && i == len -1){
                key = nums[i];
            }
        }
        return key;


    }

    static void main() {

    }
}
