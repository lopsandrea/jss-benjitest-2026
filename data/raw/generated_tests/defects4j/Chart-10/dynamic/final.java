package org.jfree.data.time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Chart-10. */
class TimeSeriesTest {

    @Test
    void timeSeriesHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new TimeSeries().result(INPUT_0));
    }

    @Test
    void timeSeriesHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new TimeSeries().result(INPUT_1));
    }

    @Test
    void timeSeriesHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new TimeSeries().result(INPUT_2));
    }

    @Test
    void timeSeriesHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new TimeSeries().result(INPUT_3));
    }
}
