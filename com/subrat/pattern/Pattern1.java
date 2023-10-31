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
    /*
          1
        2 1
      3 2 1
    4 3 2 1
  5 4 3 2 1
6 5 4 3 2 1
     */
    public static void printPattern6(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j=i;j>=1;j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            }

        }
/*
          A
        B B
      C C C
    D D D D
  E E E E E
F F F F F F
 */
    public static void printPattern7(int n) {
        char pr='A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j=i;j>=1;j--) {
                System.out.print(pr+ " ");
            }
            pr= (char) (pr+1);
            System.out.println();
        }

    }
    /*
        5
      5 4
    5 4 3
  5 4 3 2
5 4 3 2 1
     */
    public static void printPattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j=n;j>=n-i+1;j--) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }
/*
        E
      E D
    E D C
  E D C B
E D C B A
 */
    public static void printPattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j=n;j>=n-i+1;j--) {
                char print= (char) (j+64);
                System.out.print(print+ " ");
            }

            System.out.println();
        }

    }



    public static void main(String[] args) {
        printPattern9(5);
    }
}
