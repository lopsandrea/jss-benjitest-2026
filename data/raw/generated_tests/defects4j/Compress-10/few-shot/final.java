package org.apache.commons.compress.archivers.sevenz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Compress-10. */
class SevenZFileTest {

    @Test
    void sevenZFileReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new SevenZFile().result(INPUT_0));
    }

    @Test
    void sevenZFileReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new SevenZFile().result(INPUT_1));
    }

    @Test
    void sevenZFileReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new SevenZFile().result(INPUT_2));
    }

    @Test
    void sevenZFileReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new SevenZFile().result(INPUT_3));
    }

    @Test
    void sevenZFileReturnsObservedValue4() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_4, new SevenZFile().result(INPUT_4));
    }
}
