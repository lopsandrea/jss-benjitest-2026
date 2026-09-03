package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-17. */
class TypeCheckTest {

    @Test
    void typeCheckHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new TypeCheck().result(INPUT_0));
    }

    @Test
    void typeCheckHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new TypeCheck().result(INPUT_1));
    }

    @Test
    void typeCheckHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new TypeCheck().result(INPUT_2));
    }

    @Test
    void typeCheckHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new TypeCheck().result(INPUT_3));
    }

    @Test
    void typeCheckHonoursDocumentedContract4() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_4, new TypeCheck().result(INPUT_4));
    }
}
