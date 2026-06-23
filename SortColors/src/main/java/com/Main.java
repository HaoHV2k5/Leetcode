package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void merge(int[] nums, int l, int m, int r){
        int i = l;
        int j = m+1;
        int k = l;
        int[] temp = new int[nums.length];
        while(i <= m && j <=r){
            if(nums[i] <= nums[j]) temp[k++] = nums[i++];
            else{
                temp[k++] = nums[j++];
            }
        }
        while(i <= m){
            temp[k++] = nums[i++];
        }
        while(j<= r){
            temp[k++] = nums[j++];
        }
        for(int p = l ; p<= r ; p++){
            nums[p] = temp[p];
        }
    }


    public static void mergeSort(int[] nums, int l, int r){
        if(l>= r) return;
        int m = (l+r)/2;
        mergeSort(nums,l,m);
        mergeSort(nums,m+1,r);
        merge(nums, l , m, r);
    }


    public void sortColors(int[] nums) {
        mergeSort(nums, 0 , nums.length -1);
    }



    static void main() {

    }
}
