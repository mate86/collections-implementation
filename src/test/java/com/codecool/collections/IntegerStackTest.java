package com.codecool.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerStackTest {

    @Test
    void testPopIfStackIsEmpty() {
        IntegerStack stack = new IntegerStack();
        assertEquals(-1, stack.pop());
    }

    @Test
    void testPopIfStackHasOneElement() {
        IntegerStack stack = new IntegerStack();
        stack.push(3);
        assertEquals(3, stack.pop());
    }

    @Test
    void testPopIfStackHasThreeElements() {
        IntegerStack stack = new IntegerStack();
        stack.push(3);
        stack.push(7);
        stack.push(54);
        assertEquals(54, stack.pop());
    }

    @Test
    void testPopIfStackHasMoreElementsThanDefaultSize() {
        IntegerStack stack = new IntegerStack();
        stack.push(3);
        stack.push(7);
        stack.push(54);
        stack.push(22);
        stack.push(17);
        stack.push(4);
        stack.push(91);
        assertEquals(91, stack.pop());
    }

    @Test
    void testPopIfStackHasNegativeElements() {
        IntegerStack stack = new IntegerStack();
        stack.push(-3);
        stack.push(-7);
        stack.push(-54);
        stack.push(-22);
        stack.push(-17);
        stack.push(-4);
        stack.push(-91);
        assertEquals(-91, stack.pop());
    }

    @Test
    void testMaxIfStackIsEmpty() {
        IntegerStack stack = new IntegerStack();
        assertEquals(-1, stack.max());
    }

    @Test
    void testMaxIfStackHasThreeElements() {
        IntegerStack stack = new IntegerStack();
        stack.push(3);
        stack.push(7);
        stack.push(54);
        assertEquals(54, stack.max());
    }

    @Test
    void testMaxIfStackHasMoreElementsThanDefaultSize() {
        IntegerStack stack = new IntegerStack();
        stack.push(91);
        stack.push(3);
        stack.push(7);
        stack.push(22);
        stack.push(17);
        stack.push(54);
        stack.push(4);
        assertEquals(91, stack.max());
    }

    @Test
    void testMaxIfStackHasNegativeElements() {
        IntegerStack stack = new IntegerStack();
        stack.push(-91);
        stack.push(-3);
        stack.push(-7);
        stack.push(-22);
        stack.push(-17);
        stack.push(-54);
        stack.push(-4);
        assertEquals(-3, stack.max());
    }

    @Test
    void testMaxIfMaximumDecreasing() {
        IntegerStack stack = new IntegerStack();
        stack.push(3);
        stack.push(7);
        stack.push(22);
        stack.push(17);
        stack.push(4);
        stack.push(54);
        stack.push(91);
        stack.pop();
        stack.pop();
        assertEquals(22, stack.max());
    }
}
