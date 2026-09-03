package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class097Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        new Class097().compute(3);
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class097().normalize("  x "));
        assertEquals(7, new Class097().merge(2, 5));
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class097().merge(2, 5));
        assertTrue(new Class097().isValid("abc"));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class097().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class097().compute(3));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class097().compute(3));
        assertEquals("ok", new Class097().normalize("  x "));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class097().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class097().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class097().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class097().isValid("abc"));
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class097().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class097().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class097().merge(2, 5));
    }

}
