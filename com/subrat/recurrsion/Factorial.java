package com.subrat.recurrsion;
/*
Given a number print the factorial of that number.
 */
public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int result=fact(n);
        System.out.println(result);
    }
    public static int fact(int num){
        if(num==1){
            return 1;
        }else {
           return num*fact(num-1);
        }
    }
}
