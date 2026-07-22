package com;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack<>();
        int cur = 0;
        int len  = t.length;
        int[] ans = new int[len];
        for(int i = 0; i< len; i++ ){
            if(stack.isEmpty() || t[i] < t[stack.peek()]){
                stack.push(i);
                continue;
            }

            while(!stack.isEmpty() && t[stack.peek()] < t[i]){
                ans[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return ans;
    }

    static void main() {

    }
}
