package org.apache.commons.math3.linear;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingularValueDecompositionTest {

    @Test
    void singularValueDecompositionCompiles() {
        assertNotNull(new SingularValueDecomposition().resultOrDefault());
    }
}
