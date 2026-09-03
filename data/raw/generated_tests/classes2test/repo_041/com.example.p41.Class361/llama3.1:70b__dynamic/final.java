package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class361Test {
    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class361().compute(3));
        assertEquals("ok", new Class361().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class361().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class361().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class361().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenUnset() {
        assertEquals(16, new Class361().capacity());
    }

    @Test
    void reportsRatioAtZero() {
        assertEquals(0.5, new Class361().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWithNullArgument() {
        assertEquals("alpha", new Class361().labelFor(1));
    }

    @Test
    void yieldsResetForBoundaryValue() {
        new Class361().reset();
        assertNotNull(new Class361());
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class361().compute(3));
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class361().compute(3));
    }

}
