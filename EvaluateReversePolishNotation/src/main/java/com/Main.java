package com;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            int f,se = 0;
            switch (s){
                case "+":
                    f = stack.pop();
                    se = stack.pop();
                    stack.push(f + se);
                    break;
                case "-":
                    f = stack.pop();
                    se = stack.pop();
                    stack.push(se - f );
                    break;
                case "*":
                    f = stack.pop();
                    se = stack.pop();
                    stack.push(f * se);
                    break;
                case "/":
                    f = stack.pop();
                    se = stack.pop();
                    stack.push(se / f);
                    break;
                default:
                    int number = Integer.parseInt(s);
                    stack.push(number);
                    break;
            }
        }
        return stack.pop();
    }

    static void main() {

    }
}
