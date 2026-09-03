package org.apache.commons.compress.archivers.cpio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Compress-25. */
class CpioArchiveEntryTest {

    @Test
    void cpioArchiveEntryHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new CpioArchiveEntry().result(INPUT_0));
    }

    @Test
    void cpioArchiveEntryHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new CpioArchiveEntry().result(INPUT_1));
    }

    @Test
    void cpioArchiveEntryHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new CpioArchiveEntry().result(INPUT_2));
    }

    @Test
    void cpioArchiveEntryHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new CpioArchiveEntry().result(INPUT_3));
    }
}
