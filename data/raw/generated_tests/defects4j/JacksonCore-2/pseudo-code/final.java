package com.fasterxml.jackson.core.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonCore-2. */
class JsonParserSequenceTest {

    @Test
    void jsonParserSequenceReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new JsonParserSequence().result(INPUT_0));
    }

    @Test
    void jsonParserSequenceReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new JsonParserSequence().result(INPUT_1));
    }

    @Test
    void jsonParserSequenceReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new JsonParserSequence().result(INPUT_2));
    }

    @Test
    void jsonParserSequenceReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new JsonParserSequence().result(INPUT_3));
    }
}
