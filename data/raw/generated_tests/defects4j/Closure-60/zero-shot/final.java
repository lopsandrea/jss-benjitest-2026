package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-60. */
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
}
