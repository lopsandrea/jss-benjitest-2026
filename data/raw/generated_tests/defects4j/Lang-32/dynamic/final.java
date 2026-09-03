package org.apache.commons.lang3.time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Lang-32. */
class DateUtilsTest {

    @Test
    void dateUtilsHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new DateUtils().result(INPUT_0));
    }

    @Test
    void dateUtilsHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new DateUtils().result(INPUT_1));
    }

    @Test
    void dateUtilsHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new DateUtils().result(INPUT_2));
    }
}
