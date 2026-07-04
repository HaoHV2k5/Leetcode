package com;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String encode(List<String> strs) {
        String list = "";
        for(String l : strs){
            int len = l.length();

            list+=len + "#" +l;

        }

        return list;
    }
    //4#abc14#abc24#abc3  len= 17
    public static List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int i = 0;
        int len = str.length() - 1;
        while(i <= len){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int size = (int)(str.charAt(j-1));
            String subString = str.substring(j+1, j+size+1);
            i = j+size+1;
            ans.add(subString);

        }
        return ans;

    }

    static void main() {
        List<String> strs = new ArrayList<>();
        strs.add("abc1");
        strs.add("abc2");
        strs.add("abc3");
        System.out.println(encode(strs));
        List<String> strs1 = new ArrayList<>();
        strs1 = decode(encode(strs));
        for(String s : strs1){
            System.out.println(s);
        }
    }
}
