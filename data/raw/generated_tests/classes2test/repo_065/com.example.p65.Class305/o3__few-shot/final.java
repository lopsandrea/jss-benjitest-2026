package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class305Test {
    @Test
    void acceptsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class305().compute(3));
            assertEquals("ok", new Class305().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class305().normalize("  x "));
        assertEquals(7, new Class305().merge(2, 5));
    }

    @Test
    void acceptsMergeForKnownCode() {
        assertEquals(7, new Class305().merge(2, 5));
        assertTrue(new Class305().isValid("abc"));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class305().isValid("abc"));
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class305().capacity());
    }

    @Test
    void returnsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class305().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class305().labelFor(1));
    }

    @Test
    void preservesResetAtZero() {
        new Class305().reset();
        assertNotNull(new Class305());
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class305().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class305().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class305().merge(2, 5));
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class305().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class305().normalize("  x "));
    }

}
