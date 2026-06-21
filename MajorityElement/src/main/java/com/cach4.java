package com;

import java.util.HashMap;
import java.util.Map;

public class cach4 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;

            if (count > nums.length / 2) {
                return num;
            }

            map.put(num, count);
        }

        return -1;
    }
}
