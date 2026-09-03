package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {
    @Test
    void rejectsComputeOnEmptyString() {
        assertEquals(42, new Class216().compute(3));
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class216().normalize("  x "));
        assertEquals(7, new Class216().merge(2, 5));
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class216().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        assertEquals(16, new Class216().capacity());
    }

    @Test
    void keepsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class216().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnMixedCase() {
        assertEquals("alpha", new Class216().labelFor(1));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class216().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class216().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

}
