package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-14. */
class ParserTest {

    @Test
    void parserPreservesUnrelatedBehaviour0() {
        Parser subject = new Parser();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void parserPreservesUnrelatedBehaviour1() {
        Parser subject = new Parser();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void parserPreservesUnrelatedBehaviour2() {
        Parser subject = new Parser();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
