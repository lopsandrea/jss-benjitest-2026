package org.apache.commons.compress.archivers.zip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZipArchiveInputStreamTest {

    @Test
    void zipArchiveInputStreamCompiles() {
        assertNotNull(new ZipArchiveInputStream().resultOrDefault());
    }
}
