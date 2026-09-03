package com.fasterxml.jackson.databind.deser.std;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-84. */
class StdDeserializerTest {

    @Test
    void stdDeserializerReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new StdDeserializer().result(INPUT_0));
    }

    @Test
    void stdDeserializerReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new StdDeserializer().result(INPUT_1));
    }

    @Test
    void stdDeserializerReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new StdDeserializer().result(INPUT_2));
    }

    @Test
    void stdDeserializerReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new StdDeserializer().result(INPUT_3));
    }

    @Test
    void stdDeserializerReturnsObservedValue4() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_4, new StdDeserializer().result(INPUT_4));
    }
}
