package com.subrat.array;

import java.util.Scanner;

/*
Searching a element in sorted array using binary search.
 */
public class BinarySc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int result=binSearch(arr,k);
        System.out.println("Binary search result  "+result);
    }

    private static int binSearch(int[] arr, int k) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+((end-start)/2);
            if (arr[mid]==k){
                return mid;
            }else if(arr[mid]>k){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }
}
