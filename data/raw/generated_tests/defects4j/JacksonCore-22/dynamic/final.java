package com.fasterxml.jackson.core.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonCore-22. */
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

    @Test
    void jsonParserSequenceReturnsObservedValue4() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_4, new JsonParserSequence().result(INPUT_4));
    }

    @Test
    void jsonParserSequenceReturnsObservedValue5() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_5, new JsonParserSequence().result(INPUT_5));
    }
}
