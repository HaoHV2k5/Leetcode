package com;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public boolean isAnagram(String s, String t) {
        int len_s = s.length();
        int len_t = t.length();
        if(len_s != len_t) return false;
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);
        String arrangeS = new String(charsS);
        String arrangeT = new String(charsT);
        if(!arrangeS.equals(arrangeT)) return false;
        return true;
    }
    static void main() {

    }
}
