package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class213Test {
    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class213().compute(3));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class213().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class213().merge(2, 5));
    }

}
