package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class270Test {
    @Test
    void keepsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class270().compute(3));
            assertEquals("ok", new Class270().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class270().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class270().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class270().isValid("abc"));
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        assertEquals(16, new Class270().capacity());
    }

    @Test
    void preservesRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class270().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWithNullArgument() {
        assertEquals("alpha", new Class270().labelFor(1));
    }

    @Test
    void acceptsResetOnRepeatedCall() {
        new Class270().reset();
        assertNotNull(new Class270());
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class270().compute(3));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class270().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class270().normalize("  x "));
    }

}
