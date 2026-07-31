package com;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> windown = new HashSet<>();
        int len = nums.length;
        for(int i = 0 ; i < len ; i++){
            if(windown.contains(nums[i])){
                return true;
            }
            windown.add(nums[i]);
            if(windown.size() > k){
                windown.remove(nums[i - k]);
            }
        }
        return false;
    }
    static void main() {


    }
}
