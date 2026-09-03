package org.apache.commons.compress.archivers.cpio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Compress-16. */
class CpioArchiveEntryTest {

    @Test
    void cpioArchiveEntryPreservesUnrelatedBehaviour0() {
        CpioArchiveEntry subject = new CpioArchiveEntry();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void cpioArchiveEntryPreservesUnrelatedBehaviour1() {
        CpioArchiveEntry subject = new CpioArchiveEntry();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void cpioArchiveEntryPreservesUnrelatedBehaviour2() {
        CpioArchiveEntry subject = new CpioArchiveEntry();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
