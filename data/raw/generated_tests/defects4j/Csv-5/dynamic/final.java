package org.apache.commons.csv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Csv-5. */
class CSVFormatTest {

    @Test
    void cSVFormatReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new CSVFormat().result(INPUT_0));
    }

    @Test
    void cSVFormatReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new CSVFormat().result(INPUT_1));
    }

    @Test
    void cSVFormatReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new CSVFormat().result(INPUT_2));
    }
}
