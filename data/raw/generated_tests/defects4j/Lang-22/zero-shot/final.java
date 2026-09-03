package org.apache.commons.lang3.time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Lang-22. */
class FastDateFormatTest {

    @Test
    void fastDateFormatHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new FastDateFormat().result(INPUT_0));
    }

    @Test
    void fastDateFormatHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new FastDateFormat().result(INPUT_1));
    }

    @Test
    void fastDateFormatHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new FastDateFormat().result(INPUT_2));
    }

    @Test
    void fastDateFormatHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new FastDateFormat().result(INPUT_3));
    }
}
