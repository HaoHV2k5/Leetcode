package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0 ;
        int r = matrix.length -1 ;

        int mid = -1;
        while(l <= r){
            mid = l + (r - l )/2;
            if(matrix[mid][0] == target){
                return true;
            }
            else if(matrix[mid][0] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        int row = r;
        if(row < 0) return false;
        l = 0;
        r = matrix[row].length - 1;
        while(l <= r){
            mid = l + (r - l )/2;
            if(matrix[row][mid] == target){
                return true;
            }
            else if(matrix[row][mid] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return false;
    }

    static void main() {

    }
}
