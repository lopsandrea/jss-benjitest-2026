package org.jfree.data.statistics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Chart-20. */
class StatisticsTest {

    @Test
    void statisticsAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new Statistics().result(INPUT_0));
    }

    @Test
    void statisticsAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new Statistics().result(INPUT_1));
    }

    @Test
    void statisticsAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new Statistics().result(INPUT_2));
    }

    @Test
    void statisticsAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new Statistics().result(INPUT_3));
    }
}
