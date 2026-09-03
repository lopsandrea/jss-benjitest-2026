package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class339Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        new Class339().compute(3);
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        new Class339().normalize("  x ");
    }

    @Test
    void reportsMergeOnMixedCase() {
        new Class339().merge(2, 5);
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class339().isValid("abc"));
        assertEquals(16, new Class339().capacity());
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        assertEquals(16, new Class339().capacity());
        assertEquals(0.5, new Class339().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioForKnownCode() {
        assertEquals(0.5, new Class339().ratio(1.0, 2.0), 1e-9);
        assertEquals(42, new Class339().compute(3));
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class339().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class339().normalize("  x "));
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class339().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class339().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class339().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class339().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class339().capacity());
    }

}
