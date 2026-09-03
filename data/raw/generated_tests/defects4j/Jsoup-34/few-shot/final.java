package org.jsoup.safety;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-34. */
class CleanerTest {

    @Test
    void cleanerReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new Cleaner().result(INPUT_0));
    }

    @Test
    void cleanerReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new Cleaner().result(INPUT_1));
    }

    @Test
    void cleanerReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new Cleaner().result(INPUT_2));
    }

    @Test
    void cleanerReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new Cleaner().result(INPUT_3));
    }
}
