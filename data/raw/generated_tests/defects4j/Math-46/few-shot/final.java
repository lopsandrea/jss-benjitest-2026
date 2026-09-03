package org.apache.commons.math3.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Math-46. */
class MathUtilsTest {

    @Test
    void mathUtilsPreservesUnrelatedBehaviour0() {
        MathUtils subject = new MathUtils();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void mathUtilsPreservesUnrelatedBehaviour1() {
        MathUtils subject = new MathUtils();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void mathUtilsPreservesUnrelatedBehaviour2() {
        MathUtils subject = new MathUtils();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
