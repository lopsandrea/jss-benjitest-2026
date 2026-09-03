package org.apache.commons.csv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Csv-8. */
class CSVRecordTest {

    @Test
    void cSVRecordHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new CSVRecord().result(INPUT_0));
    }

    @Test
    void cSVRecordHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new CSVRecord().result(INPUT_1));
    }

    @Test
    void cSVRecordHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new CSVRecord().result(INPUT_2));
    }

    @Test
    void cSVRecordHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new CSVRecord().result(INPUT_3));
    }
}
