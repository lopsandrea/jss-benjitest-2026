package com.fasterxml.jackson.databind.introspect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-32. */
class AnnotatedClassTest {

    @Test
    void annotatedClassHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new AnnotatedClass().result(INPUT_0));
    }

    @Test
    void annotatedClassHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new AnnotatedClass().result(INPUT_1));
    }

    @Test
    void annotatedClassHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new AnnotatedClass().result(INPUT_2));
    }

    @Test
    void annotatedClassHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new AnnotatedClass().result(INPUT_3));
    }

    @Test
    void annotatedClassHonoursDocumentedContract4() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_4, new AnnotatedClass().result(INPUT_4));
    }

    @Test
    void annotatedClassHonoursDocumentedContract5() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_5, new AnnotatedClass().result(INPUT_5));
    }
}
