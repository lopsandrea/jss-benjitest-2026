package org.apache.commons.math3.distribution;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Math-89. */
class NormalDistributionTest {

    @Test
    void normalDistributionAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new NormalDistribution().result(INPUT_0));
    }

    @Test
    void normalDistributionAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new NormalDistribution().result(INPUT_1));
    }

    @Test
    void normalDistributionAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new NormalDistribution().result(INPUT_2));
    }

    @Test
    void normalDistributionAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new NormalDistribution().result(INPUT_3));
    }
}
