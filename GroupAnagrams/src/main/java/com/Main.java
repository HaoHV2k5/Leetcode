package com;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        int len = strs.length;
        for(int i=0 ; i< len ; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String newString = new String(chars);
            List<String> value = new ArrayList<>();
            if(map.containsKey(newString)){
                value = map.get(newString);
                value.add(strs[i]);
                map.put(newString, value);
            }
            else{
                map.put(newString, new ArrayList<>(List.of(strs[i])));
            }

        }

        List<List<String>> ans = new ArrayList<>();
        for(List<String> list : map.values()){
            ans.add(list);
        }
        return ans;

    }



    static void main() {

    }
}
