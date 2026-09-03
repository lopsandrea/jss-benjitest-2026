package org.apache.commons.math3.optim.linear;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Math-91. */
class SimplexSolverTest {

    @Test
    void simplexSolverReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new SimplexSolver().result(INPUT_0));
    }

    @Test
    void simplexSolverReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new SimplexSolver().result(INPUT_1));
    }

    @Test
    void simplexSolverReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new SimplexSolver().result(INPUT_2));
    }

    @Test
    void simplexSolverReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new SimplexSolver().result(INPUT_3));
    }

    @Test
    void simplexSolverReturnsObservedValue4() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_4, new SimplexSolver().result(INPUT_4));
    }

    @Test
    void simplexSolverReturnsObservedValue5() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_5, new SimplexSolver().result(INPUT_5));
    }
}
