package com.subrat.array;

import java.util.Scanner;
/*
Find pivot element of given array
 */
public class PivotIndex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int result= findPivotIndex(arr);
//        int result1=pivotInOne(arr);
        System.out.println("Pivot index is====="+result);
    }

    private static int pivotInOne(int[] arr) {
        int j=arr.length-1;
        int i=0;
        int leftSum=arr[i];
        int rightSum=arr[j];

        while(i<j){
            if(leftSum==rightSum){
                return ++i;
            }else if(leftSum<rightSum){
                i++;
                leftSum+=arr[i];
            }else {
                j--;
                rightSum+=arr[j];

            }

        }
        return -1;
    }

    private static int findPivotIndex(int[] arr) {
        int n =arr.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=arr[i];
        }
        int leftSum=0;
        int rightSum=totalSum;
        for (int i=0;i<n;i++){
            rightSum-=arr[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;

    }
}
