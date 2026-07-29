package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // cách 1
    public int findMin(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        int ans = nums[0];
        while(l <= r){
            int mid = l + (r - l )/2;

            if(nums[mid] >= ans){
                l = mid +1;

            }
            else{
                r = mid-1 ;
                ans = nums[mid];
            }
        }
        return ans;
    }

    // cách 2
    public int findMin2(int[] nums) {

        int l = 0;
        int r = nums.length - 1;


        while(l < r){
            int mid = l + (r - l )/2;

            if(nums[mid] > nums[r] ){
                l = mid +1;

            }
            else{
                r = mid;

            }
        }
        return nums[l];
    }


    static void main() {

    }
}
