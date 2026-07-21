package com;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for(String str : operations){

            switch (str){
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    stack.push(stack.peek() + stack.elementAt(stack.size() -2));
                    break;
                default:
                    int number = Integer.parseInt(str);
                    stack.push(number);
                    break;
            }
        }
        int ans = 0;
        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        return ans;

    }
    static void main() {

    }
}
