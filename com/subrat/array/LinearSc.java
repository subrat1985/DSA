package com.subrat.array;

import java.util.Scanner;
/*
Searching a element in unsorted array using linear search.
 */
public class LinearSc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int result=linSearch(arr,k);
        System.out.println("Linear search result  "+result);
    }

    private static int linSearch(int[] arr, int k) {
        for (int i=0;i< arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}
