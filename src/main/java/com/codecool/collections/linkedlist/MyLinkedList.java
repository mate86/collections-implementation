package com.codecool.collections.linkedlist;

public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node newHead = head;
            while (newHead.next != null) {
                newHead = newHead.next;
            }
            newHead.next = new Node(data);
        }
        size++;
    }

    public int get(int index){
        Node newHead = head;
        for (int i = 0; i < index; i++) {
            newHead = newHead.next;
        }
        return newHead.data;
    }

    public void set(int index, int data) {

    }

    public void remove(int index) {

    }

    public int size() {
        return size;
    }
}
