package org.apache.commons.math3.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Math-4. */
class MathUtilsTest {

    @Test
    void mathUtilsReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new MathUtils().result(INPUT_0));
    }

    @Test
    void mathUtilsReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new MathUtils().result(INPUT_1));
    }

    @Test
    void mathUtilsReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new MathUtils().result(INPUT_2));
    }

    @Test
    void mathUtilsReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new MathUtils().result(INPUT_3));
    }
}
