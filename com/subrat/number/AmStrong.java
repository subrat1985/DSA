package com.subrat.number;

public class AmStrong {
    public static boolean isAmStrong(int num){
        int order=findOrder(num);
        int remainder=0;
        int sum=0;
        int originalNumber=num;
        while (originalNumber>0){
            remainder = originalNumber % 10;
            sum += Math.pow(remainder, order);
            originalNumber /= 10;
        }

        if(sum==num)
            return true;
        return false;
    }

    private static int findOrder(int num) {
        int data=0;
        while (num>0){
           num/=10;
           data++;
        }
        return data;
    }

    public static void main(String[] args) {
        int n=371;
        isAmStrong(n);
    }
}
