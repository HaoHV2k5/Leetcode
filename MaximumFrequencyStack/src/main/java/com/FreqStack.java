package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FreqStack {

    Map<Integer,Integer> map;
    Map<Integer, Stack<Integer>> fre;
    int maxFre = 0;

    public FreqStack() {
        map = new HashMap<>();
        fre = new HashMap<>();
    }

    public void push(int val) {

        if(!map.containsKey(val)){
            map.put(val,0);
        }
        map.put(val, 1+ map.get(val));
        maxFre = Math.max(maxFre, map.get(val));
        if(!fre.containsKey(map.get(val))){
            fre.put(map.get(val), new Stack());
        }
        Stack f = fre.get(map.get(val));
        f.push(val);
        // fre.put(map.get(val), f.push(val));
    }

    public int pop() {
        int ans = -1;
        ans = fre.get(maxFre).pop();
        map.put(ans, map.get(ans) - 1);
        if(fre.get(maxFre).isEmpty()){
            maxFre--;
        }
        return ans;
    }
}
