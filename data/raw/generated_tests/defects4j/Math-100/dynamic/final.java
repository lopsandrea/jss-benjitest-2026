package org.apache.commons.math3.analysis.solvers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Math-100. */
class BrentSolverTest {

    @Test
    void brentSolverReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new BrentSolver().result(INPUT_0));
    }

    @Test
    void brentSolverReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new BrentSolver().result(INPUT_1));
    }

    @Test
    void brentSolverReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new BrentSolver().result(INPUT_2));
    }

    @Test
    void brentSolverReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new BrentSolver().result(INPUT_3));
    }

    @Test
    void brentSolverReturnsObservedValue4() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_4, new BrentSolver().result(INPUT_4));
    }

    @Test
    void brentSolverReturnsObservedValue5() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_5, new BrentSolver().result(INPUT_5));
    }

    @Test
    void brentSolverReturnsObservedValue6() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_6, new BrentSolver().result(INPUT_6));
    }

    @Test
    void brentSolverReturnsObservedValue7() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_7, new BrentSolver().result(INPUT_7));
    }

    @Test
    void brentSolverReturnsObservedValue8() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_8, new BrentSolver().result(INPUT_8));
    }
}
