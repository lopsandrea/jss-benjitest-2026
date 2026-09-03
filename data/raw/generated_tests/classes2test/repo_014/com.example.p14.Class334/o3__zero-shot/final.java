package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class334Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class334().compute(3));
            assertEquals("ok", new Class334().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class334().normalize("  x "));
        assertEquals(7, new Class334().merge(2, 5));
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class334().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class334().isValid("abc"));
    }

    @Test
    void returnsCapacityAtUpperBound() {
        assertEquals(16, new Class334().capacity());
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class334().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class334().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class334().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class334().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class334().capacity());
    }

    @Test
    void preservesRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class334().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class334().labelFor(1));
    }

}
