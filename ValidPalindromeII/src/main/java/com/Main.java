package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean valid(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int l = 0 ;
        int r = s.length() -1;
        boolean check  = false;
        while(l < r ){
            if(s.charAt(l) != s.charAt(r) ){

                boolean isValid1 = valid(s,l+1,r);
                boolean isValid2 = valid(s,l,r-1);
                boolean res = isValid1 ? isValid1 : isValid2;
                return res;
            }
            l++;
            r--;
        }
        return true;
    }
    static void main() {

    }
}
