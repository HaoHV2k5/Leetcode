package com;

public class Cach2 {

    public static void swap(int[] nums, int indexA, int indexB){
        int temp = nums[indexA];
        nums[indexA] = nums[indexB];
        nums[indexB] = temp;
    }

    public void sortColors(int[] nums) {
        // mergeSort(nums, 0 , nums.length -1);

        int low = 0;
        int mid = 0;
        int high = nums.length -1;
        while( mid<= high ){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                mid++;
                low++;
            }
            else if(nums[mid] == 1){


                mid++;
            }
            else{
                swap(nums,mid, high);
                high--;
            }
        }
    }

}
