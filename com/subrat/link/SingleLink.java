package com.subrat.link;

public class SingleLink {
    private Node head;
    private Node tail;
    private int size;

    public SingleLink() {
        this.size = size;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next=head;
        head = node;
        if (tail == null) {
            tail=head;
        }
        size++;
    }
    public void insertLast(int value) {
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next=node;
        tail = node;
        size++;
    }
    public void display(){
        Node tmp=head;
        while (tmp!=null){
            System.out.print(tmp.data+"->");
            tmp=tmp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }
    }
}
