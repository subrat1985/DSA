package com.subrat.recurrsion;
/*
Given a number print in decreasing or increasing order.
if number is 5 then it should print 5,4,3,2,1 vice versa.
 */
public class DecInc {
 public static void dec(int n){
        if(n<1){
            return;
        }else {
            System.out.println(n);
            dec(n-1);
        }
    }
    public static void inc(int n){
        if(n<1){
            return;
        }else {
            dec(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        dec(5);
        inc(5);
    }
}
