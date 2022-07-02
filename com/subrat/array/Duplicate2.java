package com.subrat.array;

import java.util.HashMap;
import java.util.Map;

public class Duplicate2 {
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

    public static void main(String[] args) {
        int arr[]={1,0,2,1,3};
        int k=3;
        System.out.println(containsNearbyDuplicate(arr,k));
    }
}
