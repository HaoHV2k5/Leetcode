package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int i =0;
        int  j =0;
        int cur = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                ans[cur++] = nums1[i++];
            }
            else{
                ans[cur++] = nums2[j++];
            }
        }
        while(i < m){
            ans[cur++] = nums1[i++];
        }
        while(j < n){
            ans[cur++] = nums2[j++];
        }
        i = 0;
        for(int k : ans){
            nums1[i++] = k;
        }
    }

    static void main() {

    }
}
