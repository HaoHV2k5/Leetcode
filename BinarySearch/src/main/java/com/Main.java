package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l <=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                l = mid+1;
            }
            else{
                r = mid - 1;
            }
        }
        return -1;
    }
    static void main() {

    }
}
