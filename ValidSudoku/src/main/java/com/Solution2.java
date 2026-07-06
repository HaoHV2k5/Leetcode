package com;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < 9 ; i++){
            for(int j=0; j< 9; j++){
                char w = board[i][j];
                if(w == '.') continue;
                if(!set.add("R"+i+w) || !set.add("C"+j+w) || !set.add("B"+ i/3 + j/3 + w)) return false;
            }
        }
        return true;
    }
}
