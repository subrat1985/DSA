package com.subrat.recurrsion;
/*
Given a string and print all subset of given string.
 */
public class StrSubset {
    public static void powerSet(String str, int index, String curr)
    {
        int n = str.length();

        // base case
        if (index == n)
        {
            System.out.println(curr);
            return;
        }

        // Two cases for every character
        // (i) We consider the character
        // as part of current subset
        // (ii) We do not consider current
        // character as part of current
        // subset
        powerSet(str, index + 1, curr + str.charAt(index));
        powerSet(str, index + 1, curr);
    }

    public static void main(String[] args) {
        String str = "abc";
        int index = 0;
        String curr="";
        powerSet(str,index,curr);
    }
}
