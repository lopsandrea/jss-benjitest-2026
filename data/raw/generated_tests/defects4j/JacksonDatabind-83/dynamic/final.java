package com.fasterxml.jackson.databind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-83. */
class ObjectMapperTest {

    @Test
    void objectMapperReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new ObjectMapper().result(INPUT_0));
    }

    @Test
    void objectMapperReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new ObjectMapper().result(INPUT_1));
    }

    @Test
    void objectMapperReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new ObjectMapper().result(INPUT_2));
    }

    @Test
    void objectMapperReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new ObjectMapper().result(INPUT_3));
    }
}
