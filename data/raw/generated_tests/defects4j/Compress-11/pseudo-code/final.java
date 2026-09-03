package org.apache.commons.compress.archivers.tar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Compress-11. */
class TarArchiveEntryTest {

    @Test
    void tarArchiveEntryAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new TarArchiveEntry().result(INPUT_0));
    }

    @Test
    void tarArchiveEntryAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new TarArchiveEntry().result(INPUT_1));
    }

    @Test
    void tarArchiveEntryAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new TarArchiveEntry().result(INPUT_2));
    }

    @Test
    void tarArchiveEntryAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new TarArchiveEntry().result(INPUT_3));
    }

    @Test
    void tarArchiveEntryAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new TarArchiveEntry().result(INPUT_4));
    }
}
