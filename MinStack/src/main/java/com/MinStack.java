package com;

import java.util.ArrayList;
import java.util.List;

public class MinStack {


    private List<Integer> list;
    private List<Integer> minStack;

    public MinStack() {
        list = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    public void push(int value) {
        list.add(value);
        if(minStack.isEmpty() || value <= minStack.get(minStack.size() -1) ){
            minStack.add(value);
        }
    }

    public void pop() {
        if(list.isEmpty()) return;
        int len = list.size();
        int lastElement = list.remove(len -1);
        if(minStack.get(minStack.size() -1 ) == lastElement){
            minStack.remove(minStack.size() -1);
        }

    }

    public int top() {
        return list.get(list.size() -1);
    }

    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}
