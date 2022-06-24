package com.subrat.array;
/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.



Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class RunSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        runArraySum(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int[] runArraySum(int[] arr) {
        for(int i=1;i< arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
}
