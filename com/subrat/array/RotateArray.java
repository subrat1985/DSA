package com.subrat.array;
//https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
public class RotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int d=3;
        int n=arr.length;
        rotate(arr,d,n);

    }
    static void rotate(int arr[],int d,int n){
        int rot=d%n;
        int temp[]=new int[rot];
        int j=0;
        for(int i=0;i<rot;i++){
            temp[i]=arr[j++];
        }
        for(int i=0;i<n-rot;i++){
            arr[i]=arr[i+rot];
        }
        int k=0;
        for(int i=n-rot;i<n;i++){
            arr[i]=temp[k++];
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }

    }
}
