package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void reverseString(char[] s) {
        int r = s.length -1;
        int l = 0;
        while(l< r){
            char temp = s[l];
            s[l] = s[r];
            s[r] =  temp;
            l++;
            r--;

        }

    }
    static void main() {

    }
}
