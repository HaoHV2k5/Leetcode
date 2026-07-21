package com;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<Integer> list;
    public MyQueue() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    public int peek() {
        int num = list.get(0);
        return num;
    }

    public boolean empty() {
        return list.isEmpty();
    }
}
