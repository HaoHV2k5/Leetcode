package com;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = numbers.length;
        for(int i = 0 ; i< len ; i++){
            int temp = target - numbers[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp)+1, i+1};
            }
            map.put(numbers[i], i);
        }
        return new int[]{0,0};
    }
    static void main() {

    }
}
