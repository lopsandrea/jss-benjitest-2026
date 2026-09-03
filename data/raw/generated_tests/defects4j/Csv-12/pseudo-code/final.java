package org.apache.commons.csv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Csv-12. */
class CSVRecordTest {

    @Test
    void cSVRecordReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new CSVRecord().result(INPUT_0));
    }

    @Test
    void cSVRecordReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new CSVRecord().result(INPUT_1));
    }

    @Test
    void cSVRecordReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new CSVRecord().result(INPUT_2));
    }
}
