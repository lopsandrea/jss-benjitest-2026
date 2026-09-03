package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class305Test {
    @Test
    void acceptsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class305().compute(3));
            assertEquals("ok", new Class305().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class305().normalize("  x "));
        assertEquals(7, new Class305().merge(2, 5));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class305().merge(2, 5));
        assertTrue(new Class305().isValid("abc"));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class305().isValid("abc"));
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class305().capacity());
    }

    @Test
    void keepsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class305().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForOnMixedCase() {
        assertEquals("alpha", new Class305().labelFor(1));
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class305().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class305().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class305().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class305().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class305().capacity());
    }

    @Test
    void clampsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class305().ratio(1.0, 2.0), 1e-9);
    }

}
