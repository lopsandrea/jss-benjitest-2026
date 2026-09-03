package org.apache.commons.compress.archivers.zip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Compress-34. */
class ZipArchiveInputStreamTest {

    @Test
    void zipArchiveInputStreamAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new ZipArchiveInputStream().result(INPUT_0));
    }

    @Test
    void zipArchiveInputStreamAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new ZipArchiveInputStream().result(INPUT_1));
    }

    @Test
    void zipArchiveInputStreamAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new ZipArchiveInputStream().result(INPUT_2));
    }

    @Test
    void zipArchiveInputStreamAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new ZipArchiveInputStream().result(INPUT_3));
    }

    @Test
    void zipArchiveInputStreamAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new ZipArchiveInputStream().result(INPUT_4));
    }
}
