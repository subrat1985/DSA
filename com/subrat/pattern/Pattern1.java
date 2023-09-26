package com.subrat.pattern;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Pattern1 {
    /*
a a a a a
b b b b b
c c c c c
d d d d d
e e e e e
 */
    public static void printPattern1(int n) {
        char print = 'a';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(print + " ");
            }
            print += 1;
            System.out.println();
        }
    }

    /*
a b c d e
a b c d e
a b c d e
a b c d e
a b c d e
 */
    public static void printPattern2(int n) {

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                char st = (char) ('a' + j - 1);
                System.out.print(st + " ");
            }
            System.out.println();
        }
    }

    /*
A
A B
A B C
A B C D
A B C D E
A B C D E F
     */
    public static void printPattern3(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                char st = (char) ('A' + j - 1);
                System.out.print(st + " ");
            }
            System.out.println();
        }
    }

    /*
10
10 11
10 11 12
10 11 12 13
10 11 12 13 14
10 11 12 13 14 15
     */
    public static void printPattern4(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int st = 10;
                System.out.print(st + j - 1 + " ");
            }
            System.out.println();
        }
    }

    /*
    A B C D E
    A B C D
    A B C
    A B
    A
     */
    public static void printPattern5(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                char st = (char) ('A' + j - 1);
                System.out.print(st + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printPattern5(6);
    }
}
