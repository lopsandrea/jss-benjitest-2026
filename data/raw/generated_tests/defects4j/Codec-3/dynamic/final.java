package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Codec-3. */
class URLCodecTest {

    @Test
    void uRLCodecHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new URLCodec().result(INPUT_0));
    }

    @Test
    void uRLCodecHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new URLCodec().result(INPUT_1));
    }

    @Test
    void uRLCodecHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new URLCodec().result(INPUT_2));
    }

    @Test
    void uRLCodecHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new URLCodec().result(INPUT_3));
    }
}
