package com.fasterxml.jackson.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonCore-15. */
class JsonFactoryTest {

    @Test
    void jsonFactoryReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new JsonFactory().result(INPUT_0));
    }

    @Test
    void jsonFactoryReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new JsonFactory().result(INPUT_1));
    }

    @Test
    void jsonFactoryReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new JsonFactory().result(INPUT_2));
    }

    @Test
    void jsonFactoryReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new JsonFactory().result(INPUT_3));
    }
}
