package org.apache.commons.compress.archivers.sevenz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SevenZFileTest {

    @Test
    void sevenZFileCompiles() {
        assertNotNull(new SevenZFile().resultOrDefault());
    }
}
