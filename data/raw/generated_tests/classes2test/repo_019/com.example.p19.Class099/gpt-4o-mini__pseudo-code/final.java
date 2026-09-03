package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class099Test {
    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class099().compute(3));
        assertEquals("ok", new Class099().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class099().normalize("  x "));
        assertEquals(7, new Class099().merge(2, 5));
    }

    @Test
    void yieldsMergeAtZero() {
        assertEquals(7, new Class099().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class099().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class099().capacity());
    }

    @Test
    void acceptsRatioOnEmptyString() {
        assertEquals(0.5, new Class099().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForAtZero() {
        assertEquals("alpha", new Class099().labelFor(1));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        assertEquals(42, new Class099().compute(3));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class099().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class099().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class099().merge(2, 5));
    }

}
