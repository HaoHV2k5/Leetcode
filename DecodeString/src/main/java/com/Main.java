package com;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public String decodeString(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        Stack<Integer> numberStack = new Stack<>();
        int number = 0;
        StringBuilder current = new StringBuilder();
        for(char w : s.toCharArray()){
            if(Character.isDigit(w)){
                number = number * 10 +(w - '0');
            }
            else if(w == '['){
                stack.add(current);
                numberStack.add(number);
                number = 0;
                current = new StringBuilder();
            }
            else if(w == ']'){
                StringBuilder prefix = stack.pop();
                int repeat = numberStack.pop();

                for(int i = 0 ; i < repeat ; i++){
                    prefix.append(current);
                }
                current = prefix;
            }else{
                current.append(w);
            }
        }
        return current.toString();
    }
    static void main() {

    }
}
