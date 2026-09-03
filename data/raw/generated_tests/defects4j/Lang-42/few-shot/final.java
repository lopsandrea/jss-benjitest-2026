package org.apache.commons.lang3.time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Lang-42. */
class FastDateFormatTest {

    @Test
    void fastDateFormatReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new FastDateFormat().result(INPUT_0));
    }

    @Test
    void fastDateFormatReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new FastDateFormat().result(INPUT_1));
    }

    @Test
    void fastDateFormatReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new FastDateFormat().result(INPUT_2));
    }
}
