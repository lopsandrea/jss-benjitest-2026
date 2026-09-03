package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class080Test {
    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class080().compute(3));
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class080().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class080().merge(2, 5));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class080().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class080().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class080().capacity());
    }

    @Test
    void clampsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class080().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class080().compute(3));
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class080().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class080().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class080().isValid("abc"));
    }

}
