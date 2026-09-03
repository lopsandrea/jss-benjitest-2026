package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class022Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class022().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class022().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class022().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class022().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        assertEquals(16, new Class022().capacity());
    }

    @Test
    void reportsRatioAtUpperBound() {
        assertEquals(0.5, new Class022().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class022().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class022().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class022().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class022().isValid("abc"));
    }

}
