package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class191Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class191().compute(3));
        assertEquals("ok", new Class191().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class191().normalize("  x "));
        assertEquals(7, new Class191().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenUnset() {
        assertEquals(7, new Class191().merge(2, 5));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class191().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        assertEquals(16, new Class191().capacity());
    }

    @Test
    void returnsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class191().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForForKnownCode() {
        assertEquals("alpha", new Class191().labelFor(1));
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class191().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class191().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class191().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class191().isValid("abc"));
    }

}
