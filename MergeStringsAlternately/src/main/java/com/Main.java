package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0;
        int k = 0;
        int cur = 0;
        char[] res = new char[len1 + len2];
        while(i < len1 && k < len2){
            res[cur++] = word1.charAt(i++);
            res[cur++] = word2.charAt(k++);
        }
        while(i < len1){
            res[cur++] = word1.charAt(i++);
        }
        while(k < len2){
            res[cur++] = word2.charAt(k++);
        }
        return new String(res);
    }
    static void main() {

    }
}
