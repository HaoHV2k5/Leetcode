package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;
        int ans = 0;
        while(l <= r){
            int mid = (l + r)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                l = mid +1;
                ans = l;
            }
            else{
                r = mid -1;
                ans = l;
            }
        }
        return ans;
    }
    static void main() {

    }
}
