package org.jsoup.safety;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-19. */
class CleanerTest {

    @Test
    void cleanerHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new Cleaner().result(INPUT_0));
    }

    @Test
    void cleanerHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new Cleaner().result(INPUT_1));
    }

    @Test
    void cleanerHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new Cleaner().result(INPUT_2));
    }

    @Test
    void cleanerHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new Cleaner().result(INPUT_3));
    }

    @Test
    void cleanerHonoursDocumentedContract4() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_4, new Cleaner().result(INPUT_4));
    }
}
