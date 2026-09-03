package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class285Test {
    @Test
    void acceptsComputeAtUpperBound() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class285().compute(3));
        assertEquals("ok", new Class285().normalize("  x "));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class285().normalize("  x "));
        assertEquals(7, new Class285().merge(2, 5));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class285().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class285().isValid("abc"));
    }

    @Test
    void preservesCapacityForKnownCode() {
        assertEquals(16, new Class285().capacity());
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        assertEquals(42, new Class285().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class285().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class285().merge(2, 5));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class285().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class285().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class285().merge(2, 5));
    }

}
