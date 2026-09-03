package org.apache.commons.compress.compressors.bzip2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Compress-31. */
class BZip2CompressorInputStreamTest {

    @Test
    void bZip2CompressorInputStreamHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new BZip2CompressorInputStream().result(INPUT_0));
    }

    @Test
    void bZip2CompressorInputStreamHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new BZip2CompressorInputStream().result(INPUT_1));
    }

    @Test
    void bZip2CompressorInputStreamHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new BZip2CompressorInputStream().result(INPUT_2));
    }
}
