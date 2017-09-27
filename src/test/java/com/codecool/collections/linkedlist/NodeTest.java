package com.codecool.collections.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NodeTest {
    @Test
    void testCreatingNewNode() {
        Node node = new Node(5);
        assertEquals(5, node.data);
    }
}
