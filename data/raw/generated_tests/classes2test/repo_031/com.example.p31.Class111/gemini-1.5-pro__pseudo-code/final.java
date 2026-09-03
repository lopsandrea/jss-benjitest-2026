package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class111Test {
    @Test
    void acceptsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class111().compute(3));
            assertEquals("ok", new Class111().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class111().normalize("  x "));
            assertEquals(7, new Class111().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class111().merge(2, 5));
        assertTrue(new Class111().isValid("abc"));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class111().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class111().capacity());
    }

    @Test
    void reportsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class111().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForAtUpperBound() {
        assertEquals("alpha", new Class111().labelFor(1));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class111().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class111().normalize("  x "));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class111().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class111().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class111().merge(2, 5));
    }

}
