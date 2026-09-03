package com.fasterxml.jackson.databind.deser.std;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-40. */
class StdDeserializerTest {

    @Test
    void stdDeserializerHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new StdDeserializer().result(INPUT_0));
    }

    @Test
    void stdDeserializerHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new StdDeserializer().result(INPUT_1));
    }

    @Test
    void stdDeserializerHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new StdDeserializer().result(INPUT_2));
    }

    @Test
    void stdDeserializerHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new StdDeserializer().result(INPUT_3));
    }

    @Test
    void stdDeserializerHonoursDocumentedContract4() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_4, new StdDeserializer().result(INPUT_4));
    }
}
