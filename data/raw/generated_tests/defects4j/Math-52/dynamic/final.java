package org.apache.commons.math3.linear;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Math-52. */
class SingularValueDecompositionTest {

    @Test
    void singularValueDecompositionReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new SingularValueDecomposition().result(INPUT_0));
    }

    @Test
    void singularValueDecompositionReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new SingularValueDecomposition().result(INPUT_1));
    }

    @Test
    void singularValueDecompositionReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new SingularValueDecomposition().result(INPUT_2));
    }

    @Test
    void singularValueDecompositionReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new SingularValueDecomposition().result(INPUT_3));
    }
}
