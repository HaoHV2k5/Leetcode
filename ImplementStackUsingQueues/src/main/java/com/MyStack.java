package com;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<Integer> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);

    }

    public int pop() {
        int len = list.size() -1;
        int num = list.get(len);
        list.remove(len);
        return num;
    }

    public int top() {
        return list.get(list.size() -1);
    }

    public boolean empty() {
        int len = list.size();
        return len == 0 ? true: false;
    }
}
