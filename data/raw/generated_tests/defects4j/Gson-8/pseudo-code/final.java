package com.google.gson.reflect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Gson-8. */
class TypeTokenTest {

    @Test
    void typeTokenHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new TypeToken().result(INPUT_0));
    }

    @Test
    void typeTokenHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new TypeToken().result(INPUT_1));
    }

    @Test
    void typeTokenHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new TypeToken().result(INPUT_2));
    }

    @Test
    void typeTokenHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new TypeToken().result(INPUT_3));
    }

    @Test
    void typeTokenHonoursDocumentedContract4() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_4, new TypeToken().result(INPUT_4));
    }
}
