package com.subrat.recurrsion;
/*
Given a string check given string is palinDrome or not recursively
 */
public class PalinDrome {
    public static boolean isPalinDrome(char str[],int s,int e){
        if(s==e){
            return true;
        }
        if (str[s]!=str[e]){
            return false;
        }
        if(s<e){
            return isPalinDrome(str,s+1,e-1);
        }
        return true;
    }

    public static void main(String[] args) {
        String test="aba";
        System.out.println(isPalinDrome(test.toCharArray(),0,test.toCharArray().length-1));
    }
}
