package com.fasterxml.jackson.databind.node;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-89. */
class TypeFactoryTest {

    @Test
    void objectNodeHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new TypeFactory().result(INPUT_0));
    }

    @Test
    void objectNodeHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new TypeFactory().result(INPUT_1));
    }

    @Test
    void objectNodeHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new TypeFactory().result(INPUT_2));
    }

    @Test
    void objectNodeHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new TypeFactory().result(INPUT_3));
    }
}
