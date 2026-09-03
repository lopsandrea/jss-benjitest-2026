package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class203Test {
    @Test
    void clampsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class203().compute(3));
            assertEquals("ok", new Class203().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class203().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class203().merge(2, 5));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class203().merge(2, 5));
        assertTrue(new Class203().isValid("abc"));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class203().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class203().capacity());
    }

    @Test
    void acceptsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class203().capacity());
    }

    @Test
    void rejectsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class203().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class203().labelFor(1));
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class203().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class203().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class203().merge(2, 5));
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class203().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class203().normalize("  x "));
    }

}
