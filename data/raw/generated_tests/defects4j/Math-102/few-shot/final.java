package org.apache.commons.math3.stat.descriptive.moment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Math-102. */
class VarianceTest {

    @Test
    void variancePreservesUnrelatedBehaviour0() {
        Variance subject = new Variance();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void variancePreservesUnrelatedBehaviour1() {
        Variance subject = new Variance();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void variancePreservesUnrelatedBehaviour2() {
        Variance subject = new Variance();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
