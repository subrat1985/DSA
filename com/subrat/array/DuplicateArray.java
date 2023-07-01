package com.subrat.array;

import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                if(i - map.get(nums[i]) <= k)
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;

    }
    public static void dupliacte(int arr[],int n){
        int count[]={0,0,0,0,0};
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(count[i]>1){
                System.out.println("repeated elements---"+i);
            }
        }
    }
    public static void dupliacte1(int arr[],int n){
        for (int i = 0; i < arr.length; i++) {
            arr[arr[i] % arr.length]
                    = arr[arr[i] % arr.length]
                    + arr.length;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr.length * 2) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,0,2,1,3};
        int k=3;
        dupliacte1(arr,arr.length);
      //  System.out.println(containsNearbyDuplicate(arr,k));
    }
}
