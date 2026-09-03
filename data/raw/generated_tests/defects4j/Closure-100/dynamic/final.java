package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-100. */
class ClosureCodingConventionTest {

    @Test
    void closureCodingConventionHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new ClosureCodingConvention().result(INPUT_0));
    }

    @Test
    void closureCodingConventionHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new ClosureCodingConvention().result(INPUT_1));
    }

    @Test
    void closureCodingConventionHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new ClosureCodingConvention().result(INPUT_2));
    }

    @Test
    void closureCodingConventionHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new ClosureCodingConvention().result(INPUT_3));
    }
}
