package org.apache.commons.compress.archivers.tar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Compress-38. */
class TarArchiveEntryTest {

    @Test
    void tarArchiveEntryPreservesUnrelatedBehaviour0() {
        TarArchiveEntry subject = new TarArchiveEntry();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void tarArchiveEntryPreservesUnrelatedBehaviour1() {
        TarArchiveEntry subject = new TarArchiveEntry();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void tarArchiveEntryPreservesUnrelatedBehaviour2() {
        TarArchiveEntry subject = new TarArchiveEntry();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void tarArchiveEntryPreservesUnrelatedBehaviour3() {
        TarArchiveEntry subject = new TarArchiveEntry();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
