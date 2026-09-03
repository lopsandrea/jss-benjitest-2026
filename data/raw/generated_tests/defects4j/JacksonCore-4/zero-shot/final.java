package com.fasterxml.jackson.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonCore-4. */
class JsonGeneratorTest {

    @Test
    void jsonGeneratorHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new JsonGenerator().result(INPUT_0));
    }

    @Test
    void jsonGeneratorHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new JsonGenerator().result(INPUT_1));
    }

    @Test
    void jsonGeneratorHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new JsonGenerator().result(INPUT_2));
    }

    @Test
    void jsonGeneratorHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new JsonGenerator().result(INPUT_3));
    }

    @Test
    void jsonGeneratorHonoursDocumentedContract4() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_4, new JsonGenerator().result(INPUT_4));
    }
}
