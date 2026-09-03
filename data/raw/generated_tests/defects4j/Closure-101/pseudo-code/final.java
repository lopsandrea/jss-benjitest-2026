package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-101. */
class CheckGlobalThisTest {

    @Test
    void checkGlobalThisHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new CheckGlobalThis().result(INPUT_0));
    }

    @Test
    void checkGlobalThisHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new CheckGlobalThis().result(INPUT_1));
    }

    @Test
    void checkGlobalThisHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new CheckGlobalThis().result(INPUT_2));
    }

    @Test
    void checkGlobalThisHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new CheckGlobalThis().result(INPUT_3));
    }
}
