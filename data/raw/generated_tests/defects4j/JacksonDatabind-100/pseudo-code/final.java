package com.fasterxml.jackson.databind.node;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-100. */
class ObjectNodeTest {

    @Test
    void objectNodeReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new ObjectNode().result(INPUT_0));
    }

    @Test
    void objectNodeReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new ObjectNode().result(INPUT_1));
    }

    @Test
    void objectNodeReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new ObjectNode().result(INPUT_2));
    }
}
