package com.subrat.link;

public class SingleMain {
    public static void main(String[] args) {
        SingleLink link=new SingleLink();
        link.insertFirst(2);
        link.insertFirst(5);
        link.insertFirst(7);
        link.insertFirst(9);
        link.display();
        link.insertLast(10);
        link.insertLast(11);
        link.display();
    }
}
