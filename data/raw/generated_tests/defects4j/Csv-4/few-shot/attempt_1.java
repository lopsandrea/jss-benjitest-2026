package org.apache.commons.csv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CSVParserTest {

    @Test
    void cSVParserCompiles() {
        assertNotNull(new CSVParser().resultOrDefault());
    }
}
