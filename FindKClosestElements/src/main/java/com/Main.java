package com;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int len = arr.length;
        int l = 0;
        for(int r = 0 ; r < len ; r++){
            list.add(arr[r]);
            while(list.size() > k ){
                int a = Math.abs(arr[l] - x);
                int b = Math.abs(arr[r] - x);
                if(a > b){
                    list.remove(0);
                    l++;

                }
                else{
                    list.remove(list.size() - 1);
                }
            }
        }
        return list;
    }

    static void main() {


    }
}
