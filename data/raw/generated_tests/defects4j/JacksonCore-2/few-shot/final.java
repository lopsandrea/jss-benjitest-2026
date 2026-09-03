package com.fasterxml.jackson.core.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonCore-2. */
class JsonParserSequenceTest {

    @Test
    void jsonParserSequenceHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new JsonParserSequence().result(INPUT_0));
    }

    @Test
    void jsonParserSequenceHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new JsonParserSequence().result(INPUT_1));
    }

    @Test
    void jsonParserSequenceHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new JsonParserSequence().result(INPUT_2));
    }
}
