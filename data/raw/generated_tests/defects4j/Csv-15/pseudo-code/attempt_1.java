package org.apache.commons.csv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CSVPrinterTest {

    @Test
    void cSVPrinterCompiles() {
        assertNotNull(new CSVPrinter().resultOrDefault());
    }
}
