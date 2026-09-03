package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-93. */
class TokeniserStateTest {

    @Test
    void tokeniserStateHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new TokeniserState().result(INPUT_0));
    }

    @Test
    void tokeniserStateHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new TokeniserState().result(INPUT_1));
    }

    @Test
    void tokeniserStateHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new TokeniserState().result(INPUT_2));
    }
}
