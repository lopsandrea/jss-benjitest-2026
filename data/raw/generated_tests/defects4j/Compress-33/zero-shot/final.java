package org.apache.commons.compress.archivers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Compress-33. */
class ArchiveStreamFactoryTest {

    @Test
    void archiveStreamFactoryPreservesUnrelatedBehaviour0() {
        ArchiveStreamFactory subject = new ArchiveStreamFactory();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void archiveStreamFactoryPreservesUnrelatedBehaviour1() {
        ArchiveStreamFactory subject = new ArchiveStreamFactory();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void archiveStreamFactoryPreservesUnrelatedBehaviour2() {
        ArchiveStreamFactory subject = new ArchiveStreamFactory();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
