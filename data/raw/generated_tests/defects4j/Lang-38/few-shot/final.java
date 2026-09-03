package org.apache.commons.lang3.text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Lang-38. */
class StrBuilderTest {

    @Test
    void strBuilderReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new StrBuilder().result(INPUT_0));
    }

    @Test
    void strBuilderReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new StrBuilder().result(INPUT_1));
    }

    @Test
    void strBuilderReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new StrBuilder().result(INPUT_2));
    }

    @Test
    void strBuilderReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new StrBuilder().result(INPUT_3));
    }
}
