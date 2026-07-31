package com;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Set<Character> windown = new HashSet<>();
        char[] arr = s.toCharArray();
        int len = arr.length;
        int l =0;
        for(int i  = 0 ; i < len ; i++ ){
            boolean check = windown.add(arr[i]);
            if(windown.size() == 1){
                l = i;
            }
            if(!check){
                ans = Math.max(ans, windown.size()); // ans = 2

                if(arr[i - 1] == arr[i]){
                    windown.clear();
                    windown.add(arr[i]);
                    l = i;
                }else{
                    while(l < i){
                        windown.remove(arr[l]);
                        if(arr[l] == arr[i] ){

                            l++;
                            break;
                        }

                        l++;
                    }
                    windown.add(arr[i]);

                }


            }
        }
        ans = Math.max(ans, windown.size());
        return ans;

    }


    // c2 toi uu sliding windown hon
    public int lengthOfLongestSubstring2(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int ans = 0;

        for(int r = 0; r < s.length(); r ++){
            char w = s.charAt(r);
            while(set.contains(w)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(w);
            ans = Math.max(ans, set.size());
        }

        return ans;
    }

    static void main() {

    }
}
