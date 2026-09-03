package org.apache.commons.jxpath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JxPath-17. */
class JXPathContextTest {

    @Test
    void jXPathContextHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new JXPathContext().result(INPUT_0));
    }

    @Test
    void jXPathContextHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new JXPathContext().result(INPUT_1));
    }

    @Test
    void jXPathContextHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new JXPathContext().result(INPUT_2));
    }
}
