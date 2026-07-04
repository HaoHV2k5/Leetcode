package com;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public boolean isValidSudoku(char[][] board) {
        boolean result = false;

        for(int row = 0; row< 9 ; row++){
            Set<Character> set = new HashSet<>();
            for(int col = 0;  col < 9; col++){
                if(board[row][col] == '.'){
                    continue;
                }
                if(set.contains(board[row][col])){
                    return result;
                }
                set.add(board[row][col]);

            }
        }

        for(int col =0 ; col < 9; col ++){
            Set<Character> check = new HashSet<>();
            for(int row =0 ; row < 9; row ++){
                if(board[row][col] == '.'){
                    continue;
                }
                if(check.contains(board[row][col])){
                    return result;
                }
                check.add(board[row][col]);
            }
        }
        for(int s = 0; s < 9 ; s++){
            Set<Character> set = new HashSet<>();
            for(int i = 0 ;i< 3; i++){
                for(int j = 0; j< 3;j++){
                    int row = (s/3)*3 +i;
                    int col = (s%3) *3 +j;
                    if(board[row][col] == '.') continue;
                    if(set.contains(board[row][col])) return result;
                    set.add(board[row][col]);
                }
            }
        }
        result = true;
        return result;



    }
    static void main() {

    }
}
