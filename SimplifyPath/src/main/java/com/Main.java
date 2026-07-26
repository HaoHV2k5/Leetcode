package com;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public String simplifyPath(String path) {
        String[] part = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String p : part){
            if(p.equals("") || p.equals(".")){
                continue;
            }
            if(p.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();

                }
            }
            else{
                stack.push(p);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(String s : stack){
            ans.append("/").append(s);
        }
        return  ans.length() == 0 ? "/" :  ans.toString();
    }
    static void main() {

    }
}
