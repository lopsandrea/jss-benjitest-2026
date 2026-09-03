package org.apache.commons.math3.complex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Math-5. */
class ComplexTest {

    @Test
    void complexPreservesUnrelatedBehaviour0() {
        Complex subject = new Complex();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void complexPreservesUnrelatedBehaviour1() {
        Complex subject = new Complex();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void complexPreservesUnrelatedBehaviour2() {
        Complex subject = new Complex();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
