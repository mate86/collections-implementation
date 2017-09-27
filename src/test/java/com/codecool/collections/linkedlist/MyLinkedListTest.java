package com.codecool.collections.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyLinkedListTest {
    @Test
    void testSizeIfTheListIsEmpty() {
        MyLinkedList myLinkedList = new MyLinkedList();
        assertEquals(0, myLinkedList.size());
    }

    @Test
    void testSizeIfTheListHasOneElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(8);
        assertEquals(1, myLinkedList.size());
    }

    @Test
    void testSizeIfTheListHasThreeElements() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(8);
        myLinkedList.add(1);
        myLinkedList.add(17);
        assertEquals(3, myLinkedList.size());
    }

    @Test
    void testGetFirstElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(8);
        myLinkedList.add(19);
        assertEquals(3, myLinkedList.get(0));
    }

    @Test
    void testGetSecondElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(7);
        myLinkedList.add(2);
        assertEquals(7, myLinkedList.get(1));
    }

    @Test
    void testGetLastElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(7);
        myLinkedList.add(2);
        myLinkedList.add(15);
        myLinkedList.add(9);
        assertEquals(9, myLinkedList.get(myLinkedList.size() - 1));
    }

    @Test
    void testGetElementAtInvalidIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(7);
        myLinkedList.add(28);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            myLinkedList.get(myLinkedList.size());
        });
    }

    @Test
    void testSetFirstElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(7);
        myLinkedList.add(9);
        myLinkedList.set(0, 10);
        assertEquals(10, myLinkedList.get(0));
    }

    @Test
    void testSetSecondElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(7);
        myLinkedList.add(9);
        myLinkedList.set(1, 10);
        assertEquals(10, myLinkedList.get(1));
    }

    @Test
    void testSetLastElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(7);
        myLinkedList.add(9);
        myLinkedList.set(2, 10);
        assertEquals(10, myLinkedList.get(2));
    }

    @Test
    void testRemoveFirstElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(7);
        myLinkedList.add(9);
        myLinkedList.remove(0);
        assertEquals(7, myLinkedList.get(0));
    }

    @Test
    void testRemoveSecondElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(7);
        myLinkedList.add(9);
        myLinkedList.remove(1);
        assertEquals(9, myLinkedList.get(1));
    }

    @Test
    void testRemoveLastElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(7);
        myLinkedList.add(9);
        myLinkedList.remove(myLinkedList.size() - 1);
        assertEquals(7, myLinkedList.get(myLinkedList.size() - 1));
    }
}
