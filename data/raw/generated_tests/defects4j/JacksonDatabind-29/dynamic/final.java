package com.fasterxml.jackson.databind.introspect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-29. */
class AnnotatedClassTest {

    @Test
    void annotatedClassReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new AnnotatedClass().result(INPUT_0));
    }

    @Test
    void annotatedClassReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new AnnotatedClass().result(INPUT_1));
    }

    @Test
    void annotatedClassReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new AnnotatedClass().result(INPUT_2));
    }

    @Test
    void annotatedClassReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new AnnotatedClass().result(INPUT_3));
    }
}
