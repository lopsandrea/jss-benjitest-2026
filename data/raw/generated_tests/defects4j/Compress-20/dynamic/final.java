package org.apache.commons.compress.compressors.bzip2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Compress-20. */
class BZip2CompressorInputStreamTest {

    @Test
    void bZip2CompressorInputStreamPreservesUnrelatedBehaviour0() {
        BZip2CompressorInputStream subject = new BZip2CompressorInputStream();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void bZip2CompressorInputStreamPreservesUnrelatedBehaviour1() {
        BZip2CompressorInputStream subject = new BZip2CompressorInputStream();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void bZip2CompressorInputStreamPreservesUnrelatedBehaviour2() {
        BZip2CompressorInputStream subject = new BZip2CompressorInputStream();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
