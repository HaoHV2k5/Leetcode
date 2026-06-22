package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void merge(int[] nums, int l, int mid, int r){
        int i = l;
        int j = mid +1;
        int k = l;
        int[] temp = new  int[nums.length];
        while(i <= mid && j <= r){
            if(nums[i] <= nums[j]) temp[k++] = nums[i++];
            else{
                temp[k++] = nums[j++];
            }
        }
        while(i <= mid){
            temp[k++] = nums[i++];
        }
        while(j <= r){
            temp[k++] = nums[j++];
        }
        for(int p = l ; p<= r ; p++){
            nums[p] = temp[p];
        }
    }

    public static void mergeSort(int[] nums, int l, int r){
        if(l >= r) return;
        int mid = (l + r)/2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid+1, r);
        merge(nums,l,mid,r);
    }

    public static  int[] sortArray(int[] nums) {
        mergeSort(nums, 0 , nums.length -1);
        return nums;
    }
    static void main() {
        int[] nums = new int[]{2,5,3,1,8};

        sortArray(nums);
    }
}
