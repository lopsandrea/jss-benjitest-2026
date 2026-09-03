package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Cli-35. */
class PosixParserTest {

    @Test
    void posixParserHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new PosixParser().result(INPUT_0));
    }

    @Test
    void posixParserHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new PosixParser().result(INPUT_1));
    }

    @Test
    void posixParserHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new PosixParser().result(INPUT_2));
    }

    @Test
    void posixParserHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new PosixParser().result(INPUT_3));
    }

    @Test
    void posixParserHonoursDocumentedContract4() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_4, new PosixParser().result(INPUT_4));
    }
}
