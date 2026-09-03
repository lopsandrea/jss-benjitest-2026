package org.apache.commons.compress.archivers.sevenz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Compress-2. */
class SevenZFileTest {

    @Test
    void sevenZFileHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new SevenZFile().result(INPUT_0));
    }

    @Test
    void sevenZFileHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new SevenZFile().result(INPUT_1));
    }

    @Test
    void sevenZFileHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new SevenZFile().result(INPUT_2));
    }

    @Test
    void sevenZFileHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new SevenZFile().result(INPUT_3));
    }

    @Test
    void sevenZFileHonoursDocumentedContract4() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_4, new SevenZFile().result(INPUT_4));
    }
}
