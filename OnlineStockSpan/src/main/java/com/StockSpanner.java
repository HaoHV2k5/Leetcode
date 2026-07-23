package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StockSpanner {
    private Stack<Integer> stack;
    List<Integer> list;
    public StockSpanner() {
        stack = new Stack<>();
        list = new ArrayList<>();
    }

    public int next(int price) {
        int count = 1;

        if(stack.isEmpty() || price < stack.peek()){
            stack.push(price);
            list.add(count);
            return count;

        }
        if(price >= stack.peek() && list.get(list.size() -1) != 1){
            count += list.get(list.size() -1);
            stack.pop();
            list.remove(list.size() -1);
        }

        while(!stack.isEmpty() && price >= stack.peek()){
            count+= list.get(list.size() - 1);

            stack.pop();
            list.remove(list.size() - 1);
        }
        list.add(count);
        stack.push(price);
        return count;

    }
}
