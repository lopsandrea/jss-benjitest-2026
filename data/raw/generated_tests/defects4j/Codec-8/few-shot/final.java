package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Codec-8. */
class SoundexTest {

    @Test
    void soundexHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new Soundex().result(INPUT_0));
    }

    @Test
    void soundexHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new Soundex().result(INPUT_1));
    }

    @Test
    void soundexHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new Soundex().result(INPUT_2));
    }

    @Test
    void soundexHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new Soundex().result(INPUT_3));
    }

    @Test
    void soundexHonoursDocumentedContract4() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_4, new Soundex().result(INPUT_4));
    }
}
