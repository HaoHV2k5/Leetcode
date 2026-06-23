package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : nums){
            if(map.containsKey(number)){
                map.put(number, map.get(number) +1);
            }
            else{
                map.put(number, 0);
            }
        }

        List<Integer>[] buget = new List[nums.length + 1];
        for(int key : map.keySet()){
            int frequence = map.get(key);
            if(buget[frequence] == null){
                buget[frequence] = new ArrayList<>();
            }

            buget[frequence].add(key);

        }

        int[] ans = new int[k];
        int index =0;
        for(int i = buget.length -1 ; i>=0; i--){
            if(buget[i] != null){
                for(int num : buget[i]){
                    ans[index++] = num;
                    if(index == k) return ans;
                }
            }
        }
        return ans;
    }




    static void main() {

    }
}
