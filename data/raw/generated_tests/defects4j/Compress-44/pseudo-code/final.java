package org.apache.commons.compress.archivers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Compress-44. */
class ArchiveStreamFactoryTest {

    @Test
    void archiveStreamFactoryHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new ArchiveStreamFactory().result(INPUT_0));
    }

    @Test
    void archiveStreamFactoryHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new ArchiveStreamFactory().result(INPUT_1));
    }

    @Test
    void archiveStreamFactoryHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new ArchiveStreamFactory().result(INPUT_2));
    }

    @Test
    void archiveStreamFactoryHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new ArchiveStreamFactory().result(INPUT_3));
    }
}
