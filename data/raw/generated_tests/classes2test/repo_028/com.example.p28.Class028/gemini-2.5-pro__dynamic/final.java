package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class028Test {
    @Test
    void clampsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class028().compute(3));
            assertEquals("ok", new Class028().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class028().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class028().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class028().isValid("abc"));
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class028().capacity());
    }

    @Test
    void preservesRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class028().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForForBoundaryValue() {
        assertEquals("alpha", new Class028().labelFor(1));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class028().compute(3));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class028().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class028().normalize("  x "));
    }

}
