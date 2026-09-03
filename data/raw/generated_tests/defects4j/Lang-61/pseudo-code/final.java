package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Lang-61. */
class StringUtilsTest {

    @Test
    void stringUtilsHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new StringUtils().result(INPUT_0));
    }

    @Test
    void stringUtilsHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new StringUtils().result(INPUT_1));
    }

    @Test
    void stringUtilsHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new StringUtils().result(INPUT_2));
    }
}
