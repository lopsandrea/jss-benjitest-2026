package org.jfree.data.time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Chart-10. */
class TimeSeriesTest {

    @Test
    void timeSeriesReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new TimeSeries().result(INPUT_0));
    }

    @Test
    void timeSeriesReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new TimeSeries().result(INPUT_1));
    }

    @Test
    void timeSeriesReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new TimeSeries().result(INPUT_2));
    }

    @Test
    void timeSeriesReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new TimeSeries().result(INPUT_3));
    }
}
