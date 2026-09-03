package com.google.javascript.rhino.jstype;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-151. */
class PrototypeObjectTypeTest {

    @Test
    void prototypeObjectTypeHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new PrototypeObjectType().result(INPUT_0));
    }

    @Test
    void prototypeObjectTypeHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new PrototypeObjectType().result(INPUT_1));
    }

    @Test
    void prototypeObjectTypeHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new PrototypeObjectType().result(INPUT_2));
    }

    @Test
    void prototypeObjectTypeHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new PrototypeObjectType().result(INPUT_3));
    }
}
