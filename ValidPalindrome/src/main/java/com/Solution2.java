package com;

public class Solution2 {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int f = 0;
        for(int i=0 ; i< arr.length ; i ++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                arr[f++] = s.charAt(i);
            }
        }
        int l =0 ;
        int r = f -1;


        while(l < r){
            if(Character.toLowerCase(arr[l]) !=  Character.toLowerCase(arr[r])) return false;
            l++;
            r--;
        }
        return true;
    }
}
