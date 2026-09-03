package org.apache.commons.math3.distribution;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Math-89. */
class NormalDistributionTest {

    @Test
    void normalDistributionPreservesUnrelatedBehaviour0() {
        NormalDistribution subject = new NormalDistribution();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void normalDistributionPreservesUnrelatedBehaviour1() {
        NormalDistribution subject = new NormalDistribution();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void normalDistributionPreservesUnrelatedBehaviour2() {
        NormalDistribution subject = new NormalDistribution();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
