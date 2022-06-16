package com.subrat.array;

import java.util.Scanner;
/*
Move zeros to end of given array
 */
public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        move(arr);
        for (int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }

    private static void move(int[] arr) {
        int n= arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}
