package org.apache.commons.math3.stat.descriptive.moment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VarianceTest {

    @Test
    void varianceCompiles() {
        assertNotNull(new Variance().resultOrDefault());
    }
}
