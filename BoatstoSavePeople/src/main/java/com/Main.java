package com;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int numRescueBoats(int[] people, int limit) {
        int ans = 0;
        int l = 0;
        int r = people.length - 1;
        Arrays.sort(people);
        while(l<= r){
            if(people[l] == limit){
                ans ++;
                l++;
                continue;
            }
            if(people[r] == limit){
                ans ++;
                r--;
                continue;
            }
            int temp = limit - people[r];
            if(temp >= people[l]){
                l++;
            }
            ans++;
            r--;
        }
        return ans;
    }
    static void main() {

    }
}
