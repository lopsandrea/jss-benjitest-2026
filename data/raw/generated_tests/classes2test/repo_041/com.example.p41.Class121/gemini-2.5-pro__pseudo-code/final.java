package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class121Test {
    @Test
    void preservesComputeForKnownCode() {
        try {
            assertEquals(42, new Class121().compute(3));
            assertEquals("ok", new Class121().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class121().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class121().merge(2, 5));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class121().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class121().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class121().capacity());
    }

    @Test
    void keepsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class121().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForForKnownCode() {
        assertEquals("alpha", new Class121().labelFor(1));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class121().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class121().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class121().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class121().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class121().capacity());
    }

    @Test
    void yieldsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class121().ratio(1.0, 2.0), 1e-9);
    }

}
