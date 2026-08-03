package com;

public class c2 {

    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        if(l == r && target == nums[0]){
            return true;
        }

        while(l <= r){
            int mid = l + ( r- l) /2;
            if(nums[mid] == target){
                return true;
            }
            else{
                if(nums[l] == nums[mid] && nums[mid] == nums[r]){
                    l++;
                    r--;
                }
                else if(nums[l] <= nums[mid]){
                    if(nums[l] <= target && target < nums[mid]){
                        r = mid -1;
                    }
                    else{
                        l = mid + 1;
                    }
                }
                else{
                    if(nums[mid] < target && target <= nums[r]){
                        l = mid + 1;
                    }
                    else{
                        r = mid;
                    }
                }
            }
        }
        return false;
    }

}
