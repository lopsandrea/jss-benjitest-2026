package org.jfree.data.time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeSeriesTest {

    @Test
    void timeSeriesCompiles() {
        assertNotNull(new TimeSeries().resultOrDefault());
    }
}
