package org.apache.commons.math.analysis.solvers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Math-70. */
class BisectionSolverTest {

    @Test
    void bisectionSolverReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new BisectionSolver().result(INPUT_0));
    }

    @Test
    void bisectionSolverReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new BisectionSolver().result(INPUT_1));
    }

    @Test
    void bisectionSolverReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new BisectionSolver().result(INPUT_2));
    }

    @Test
    void bisectionSolverReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new BisectionSolver().result(INPUT_3));
    }

    @Test
    void bisectionSolverReturnsObservedValue4() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_4, new BisectionSolver().result(INPUT_4));
    }

    @Test
    void bisectionSolverReturnsObservedValue5() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_5, new BisectionSolver().result(INPUT_5));
    }

    @Test
    void bisectionSolverReturnsObservedValue6() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_6, new BisectionSolver().result(INPUT_6));
    }

    @Test
    void bisectionSolverReturnsObservedValue7() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_7, new BisectionSolver().result(INPUT_7));
    }
}
