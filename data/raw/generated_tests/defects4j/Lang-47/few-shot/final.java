package org.apache.commons.lang3.text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Lang-47. */
class StrBuilderTest {

    @Test
    void strBuilderHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new StrBuilder().result(INPUT_0));
    }

    @Test
    void strBuilderHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new StrBuilder().result(INPUT_1));
    }

    @Test
    void strBuilderHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new StrBuilder().result(INPUT_2));
    }

    @Test
    void strBuilderHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new StrBuilder().result(INPUT_3));
    }
}
