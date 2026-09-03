package org.apache.commons.compress.archivers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArchiveStreamFactoryTest {

    @Test
    void archiveStreamFactoryCompiles() {
        assertNotNull(new ArchiveStreamFactory().resultOrDefault());
    }
}
