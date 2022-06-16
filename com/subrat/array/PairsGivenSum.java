package com.subrat.array;

import java.util.Scanner;
/*
Count the number of pairs with given Sum
*/
public class PairsGivenSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
//        int result= pairSumCount(arr,sum);
        int result1= pairSumCount1(arr,sum);
        System.out.println("Count pair with given sum brute force approach  "+result1);
//        System.out.println("Count pair with given sum  "+result);
    }

    private static int pairSumCount1(int[] arr, int sum) {
        int count=0;
        int n=arr.length;
        for(int i=0;i< n;i++){
            for (int j=i+1;j< n;j++){
                if(arr[i]+arr[j]==sum)
                    count++;
            }
        }
        return count==0 ? -1:count;
    }

    private static int pairSumCount(int[] arr, int sum) {
        int n=arr.length;
        int count=0;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==sum){
                count++;
                i++;
                j--;
            }else if(arr[i]+arr[j]< sum){
                i++;
            }else {
                j--;
            }
        }
        return count==0 ? -1:count;

    }
}
