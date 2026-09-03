package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class113Test {
    @Test
    void reportsComputeOnEmptyString() {
        new Class113().compute(3);
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class113().normalize("  x "));
        assertEquals(7, new Class113().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class113().merge(2, 5));
        assertTrue(new Class113().isValid("abc"));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class113().isValid("abc"));
        assertEquals(16, new Class113().capacity());
    }

    @Test
    void clampsComputeForKnownCode() {
        assertEquals(42, new Class113().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class113().normalize("  x "));
    }

}
