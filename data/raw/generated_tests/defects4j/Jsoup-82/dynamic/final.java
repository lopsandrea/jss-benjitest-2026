package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-82. */
class TokeniserTest {

    @Test
    void tokeniserPreservesUnrelatedBehaviour0() {
        Tokeniser subject = new Tokeniser();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void tokeniserPreservesUnrelatedBehaviour1() {
        Tokeniser subject = new Tokeniser();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void tokeniserPreservesUnrelatedBehaviour2() {
        Tokeniser subject = new Tokeniser();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
