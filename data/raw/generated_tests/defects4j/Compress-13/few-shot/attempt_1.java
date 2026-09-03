package org.apache.commons.compress.archivers.cpio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CpioArchiveEntryTest {

    @Test
    void cpioArchiveEntryCompiles() {
        assertNotNull(new CpioArchiveEntry().resultOrDefault());
    }
}
