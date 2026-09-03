package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-9. */
class TokeniserTest {

    @Test
    void tokeniserHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new Tokeniser().result(INPUT_0));
    }

    @Test
    void tokeniserHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new Tokeniser().result(INPUT_1));
    }

    @Test
    void tokeniserHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new Tokeniser().result(INPUT_2));
    }

    @Test
    void tokeniserHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new Tokeniser().result(INPUT_3));
    }

    @Test
    void tokeniserHonoursDocumentedContract4() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_4, new Tokeniser().result(INPUT_4));
    }
}
