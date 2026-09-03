package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class315Test {
    @Test
    void returnsComputeOnMixedCase() {
        new Class315().compute(3);
    }

    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class315().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class315().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class315().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class315().isValid("abc"));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        assertEquals(42, new Class315().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class315().normalize("  x "));
    }

}
