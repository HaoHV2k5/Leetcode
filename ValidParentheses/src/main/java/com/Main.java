package com;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public boolean isValid(String s) {
        int len = s.length();
        if(len == 1 ||len == 0) return false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < len ; i++){
            char w = s.charAt(i);
            if(w == ')' || w == '}' || w == ']'){
                if(stack.isEmpty()) return false;
                char open  = stack.pop();
                if((open == '(' && w == ')') ||  (open == '{' && w == '}') || (open == '[' && w == ']')){
                    continue;
                }

                return false;
            }
            stack.push(w);
        }
        if(!stack.isEmpty()) return false;
        return true;
    }

    static void main() {

    }
}
