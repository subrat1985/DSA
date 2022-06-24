package com.subrat.array;

import java.util.Scanner;
/*
Given an array generate all possible subarray from given array
*/
public class GenSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        subArray(arr);
    }
    public static void subArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j< arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }

    }

}
