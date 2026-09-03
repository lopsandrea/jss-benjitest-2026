package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-22. */
class ScopedAliasesTest {

    @Test
    void scopedAliasesHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new ScopedAliases().result(INPUT_0));
    }

    @Test
    void scopedAliasesHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new ScopedAliases().result(INPUT_1));
    }

    @Test
    void scopedAliasesHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new ScopedAliases().result(INPUT_2));
    }

    @Test
    void scopedAliasesHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new ScopedAliases().result(INPUT_3));
    }

    @Test
    void scopedAliasesHonoursDocumentedContract4() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_4, new ScopedAliases().result(INPUT_4));
    }
}
