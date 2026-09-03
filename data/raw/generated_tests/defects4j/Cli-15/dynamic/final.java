package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Cli-15. */
class TypeHandlerTest {

    @Test
    void typeHandlerHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new TypeHandler().result(INPUT_0));
    }

    @Test
    void typeHandlerHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new TypeHandler().result(INPUT_1));
    }

    @Test
    void typeHandlerHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new TypeHandler().result(INPUT_2));
    }

    @Test
    void typeHandlerHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new TypeHandler().result(INPUT_3));
    }
}
