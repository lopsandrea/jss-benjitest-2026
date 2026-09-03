package com.fasterxml.jackson.databind.node;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObjectNodeTest {

    @Test
    void objectNodeCompiles() {
        assertNotNull(new ObjectNode().resultOrDefault());
    }
}
