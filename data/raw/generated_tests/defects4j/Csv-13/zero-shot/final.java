package org.apache.commons.csv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Csv-13. */
class LexerTest {

    @Test
    void lexerHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new Lexer().result(INPUT_0));
    }

    @Test
    void lexerHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new Lexer().result(INPUT_1));
    }

    @Test
    void lexerHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new Lexer().result(INPUT_2));
    }
}
