package org.apache.commons.math3.analysis.solvers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrentSolverTest {

    @Test
    void brentSolverCompiles() {
        assertNotNull(new BrentSolver().resultOrDefault());
    }
}
