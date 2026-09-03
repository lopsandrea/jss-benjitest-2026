package org.apache.commons.csv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CSVRecordTest {

    @Test
    void cSVRecordCompiles() {
        assertNotNull(new CSVRecord().resultOrDefault());
    }
}
