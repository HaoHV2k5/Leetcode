package com;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    private List<Integer> list = new ArrayList<>();
    public MyHashSet() {

    }

    public void add(int key) {
        if(!contains(key)){
            list.add(key);
        }

    }

    public void remove(int key) {

        for(int i=0; i < list.size() ; i++){
            if(list.get(i) == key){
                list.remove(i);

            }
        }


    }

    public boolean contains(int key) {
        for(int i : list){
            if(i == key) return true;
        }
        return false;
    }
}
