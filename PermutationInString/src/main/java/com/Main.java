package com;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public boolean checkInclusion(String s1, String s2) {
        int[] sub1 = new int[26];
        int[] sub2 = new int[26];
        int len1 = s1.length();
        int len2= s2.length();
        if(len1 > len2) return false;
        for(char w : s1.toCharArray()){
            sub1[w - 'a']++;
        }

        for(int r = 0 ; r < len2; r++ ){
            sub2[s2.charAt(r) - 'a']++;
            if(r >= len1){
                sub2[s2.charAt(r - len1) - 'a']--;
            }
            if(Arrays.equals(sub1,sub2)) return true;
        }
        return false;
    }

    static void main() {
    }
}
