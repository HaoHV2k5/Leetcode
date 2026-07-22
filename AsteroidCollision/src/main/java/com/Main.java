package com;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int[] asteroidCollision(int[] a) {
        Stack<Integer> stack = new Stack<>();
        for(int num : a){
            boolean check = true;
            if(stack.isEmpty() || stack.peek()*num > 0 ){
                stack.push(num);
                continue;
            }
            if(stack.peek() < 0 && num> 0) {
                stack.push(num);
                continue;
            }
            while( !stack.isEmpty() && stack.peek()> 0 && num < 0){
                if(stack.peek()  < -num){
                    stack.pop();
                }
                else if(stack.peek() == -num){
                    stack.pop();
                    check = false;
                    break;
                }
                else{
                    check = false;
                    break;
                }
            }
            if(check){
                stack.push(num);
            }
        }
        int[] ans = new int[stack.size()];
        int cur = 0;
        for(int i :  stack){
            ans[cur++] = i;
        }
        return ans;
    }


    static void main() {

    }
}
