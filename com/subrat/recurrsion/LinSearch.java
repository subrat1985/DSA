package com.subrat.recurrsion;
/*
Given an array search find the given key in the array recursively.
 */
public class LinSearch {
    public static boolean search(int arr[],int start,int end,int key){
        if(end<start){
            return false;
        }
        if (arr[start]==key) {
            return true;
        }
        if(arr[end]==key){
            return true;
        }
        return search(arr,start+1,end-1,key);
    }

    public static void main(String[] args) {
        int arr[]={2,3,1,6,5,9};
        System.out.println(search(arr,0,arr.length-1,4));
    }
}
