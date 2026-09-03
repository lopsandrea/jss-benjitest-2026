package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class183Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class183().compute(3));
            assertEquals("ok", new Class183().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class183().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class183().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class183().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class183().isValid("abc"));
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class183().capacity());
    }

    @Test
    void yieldsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class183().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class183().labelFor(1));
    }

}
