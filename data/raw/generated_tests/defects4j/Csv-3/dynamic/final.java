package org.apache.commons.csv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Csv-3. */
class CSVFormatTest {

    @Test
    void cSVFormatAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new CSVFormat().result(INPUT_0));
    }

    @Test
    void cSVFormatAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new CSVFormat().result(INPUT_1));
    }

    @Test
    void cSVFormatAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new CSVFormat().result(INPUT_2));
    }

    @Test
    void cSVFormatAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new CSVFormat().result(INPUT_3));
    }
}
