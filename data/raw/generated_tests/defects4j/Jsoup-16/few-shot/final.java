package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-16. */
class HtmlTreeBuilderTest {

    @Test
    void htmlTreeBuilderHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new HtmlTreeBuilder().result(INPUT_0));
    }

    @Test
    void htmlTreeBuilderHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new HtmlTreeBuilder().result(INPUT_1));
    }

    @Test
    void htmlTreeBuilderHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new HtmlTreeBuilder().result(INPUT_2));
    }
}
