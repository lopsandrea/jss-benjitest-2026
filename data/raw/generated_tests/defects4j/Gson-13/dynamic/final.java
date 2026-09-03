package com.google.gson.internal.bind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Gson-13. */
class TypeAdaptersTest {

    @Test
    void typeAdaptersHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new TypeAdapters().result(INPUT_0));
    }

    @Test
    void typeAdaptersHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new TypeAdapters().result(INPUT_1));
    }

    @Test
    void typeAdaptersHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new TypeAdapters().result(INPUT_2));
    }

    @Test
    void typeAdaptersHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new TypeAdapters().result(INPUT_3));
    }
}
