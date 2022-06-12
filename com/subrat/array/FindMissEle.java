package com.subrat.array;

import java.util.Scanner;

/*
Find the missing element from an array [0,n].
 */
public class FindMissEle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int result=misElement(arr,n);
        System.out.println("Missing element  "+result);
    }

    private static int misElement(int[] arr,int length) {
        int totalSum=length*(length+1)/2;
        System.out.println("totalSum is"+totalSum);
        for (int i=0;i<=length-1;i++){
            totalSum-=arr[i];
        }
        return totalSum;
    }
}
