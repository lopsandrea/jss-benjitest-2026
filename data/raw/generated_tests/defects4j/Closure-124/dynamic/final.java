package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-124. */
class FunctionTypeBuilderTest {

    @Test
    void functionTypeBuilderHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new FunctionTypeBuilder().result(INPUT_0));
    }

    @Test
    void functionTypeBuilderHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new FunctionTypeBuilder().result(INPUT_1));
    }

    @Test
    void functionTypeBuilderHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new FunctionTypeBuilder().result(INPUT_2));
    }
}
