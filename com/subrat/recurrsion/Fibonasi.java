package com.subrat.recurrsion;



public class Fibonasi {
    public static void main(String[] args) {
    int n=5;
    for(int i=0;i<n;i++) {
        System.out.println(fib(i)+"");
    }
    }
   public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
       int f1 = fib(n-1);
       int f2 = fib(n-2);
       return f1+f2;
    }
}
