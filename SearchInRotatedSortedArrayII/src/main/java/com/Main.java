package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        boolean ans1= false;
        boolean ans2 = false;
        if(l == r && target == nums[0]){
            return true;
        }

        while(l < r){
            int mid = l + ( r- l) /2;
            if(nums[mid] == target){
                return true;
            }
            else{
                ans1 = check(nums,target,l, mid -1);
                ans2 = check(nums,target, mid + 1,r);
                break;
            }
        }
        return ans1 ? ans1 : ans2;
    }
    public static boolean check(int[] nums, int target, int l, int r){
        boolean ans1 = false;
        boolean ans2 = false;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target) return true;
            else{
                ans1 = check(nums,target, l, mid -1);
                ans2 = check(nums, target, mid + 1, r);
                break;
            }

        }
        return ans1 ? ans1 : ans2;
    }

    static void main() {

    }
}
