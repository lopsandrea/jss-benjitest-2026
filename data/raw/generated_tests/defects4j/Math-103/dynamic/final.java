package org.apache.commons.math3.distribution;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Math-103. */
class NormalDistributionTest {

    @Test
    void normalDistributionReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new NormalDistribution().result(INPUT_0));
    }

    @Test
    void normalDistributionReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new NormalDistribution().result(INPUT_1));
    }

    @Test
    void normalDistributionReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new NormalDistribution().result(INPUT_2));
    }

    @Test
    void normalDistributionReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new NormalDistribution().result(INPUT_3));
    }

    @Test
    void normalDistributionReturnsObservedValue4() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_4, new NormalDistribution().result(INPUT_4));
    }

    @Test
    void normalDistributionReturnsObservedValue5() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_5, new NormalDistribution().result(INPUT_5));
    }

    @Test
    void normalDistributionReturnsObservedValue6() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_6, new NormalDistribution().result(INPUT_6));
    }

    @Test
    void normalDistributionReturnsObservedValue7() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_7, new NormalDistribution().result(INPUT_7));
    }

    @Test
    void normalDistributionReturnsObservedValue8() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_8, new NormalDistribution().result(INPUT_8));
    }
}
