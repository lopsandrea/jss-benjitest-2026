package org.apache.commons.compress.archivers.tar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TarArchiveEntryTest {

    @Test
    void tarArchiveEntryCompiles() {
        assertNotNull(new TarArchiveEntry().resultOrDefault());
    }
}
