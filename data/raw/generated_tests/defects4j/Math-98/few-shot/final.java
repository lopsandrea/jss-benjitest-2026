package org.apache.commons.math3.stat.descriptive.moment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Math-98. */
class VarianceTest {

    @Test
    void varianceReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new Variance().result(INPUT_0));
    }

    @Test
    void varianceReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new Variance().result(INPUT_1));
    }

    @Test
    void varianceReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new Variance().result(INPUT_2));
    }

    @Test
    void varianceReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new Variance().result(INPUT_3));
    }

    @Test
    void varianceReturnsObservedValue4() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_4, new Variance().result(INPUT_4));
    }

    @Test
    void varianceReturnsObservedValue5() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_5, new Variance().result(INPUT_5));
    }
}
