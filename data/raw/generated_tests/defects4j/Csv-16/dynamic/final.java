package org.apache.commons.csv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Csv-16. */
class CSVPrinterTest {

    @Test
    void cSVPrinterHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new CSVPrinter().result(INPUT_0));
    }

    @Test
    void cSVPrinterHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new CSVPrinter().result(INPUT_1));
    }

    @Test
    void cSVPrinterHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new CSVPrinter().result(INPUT_2));
    }
}
