package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int ans = 0;
        int l = 0;
        int maxFre = 0;
        int len = s.length();
        for(int r = 0 ; r < len; r ++){
            arr[s.charAt(r) - 'A']++;
            maxFre = Math.max(maxFre, arr[s.charAt(r) - 'A']);
            while((r - l + 1) - maxFre > k){
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }

    static void main() {

    }
}
