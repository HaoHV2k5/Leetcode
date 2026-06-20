package com;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int len = strs.length;
        String lenF = strs[0];
        String lenL = strs[len-1];
        int minLen = Math.min(lenF.length(), lenL.length());

        String ans = "";
        for(int i=0 ; i<minLen; i++){
            if(lenF.charAt(i) != lenL.charAt(i)){
                return ans;
            }
            ans+=lenF.charAt(i);
        }
        return ans;

    }
    static void main() {

    }
}
