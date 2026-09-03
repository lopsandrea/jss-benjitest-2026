package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class103Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class103().compute(3));
            assertEquals("ok", new Class103().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class103().normalize("  x "));
        assertEquals(7, new Class103().merge(2, 5));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class103().merge(2, 5));
        assertTrue(new Class103().isValid("abc"));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class103().isValid("abc"));
        assertEquals(16, new Class103().capacity());
    }

    @Test
    void rejectsCapacityOnRepeatedCall() {
        assertEquals(16, new Class103().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class103().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class103().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class103().labelFor(1));
    }

    @Test
    void rejectsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class103().labelFor(1));
        int expected1 = 42;
        assertEquals(expected1, new Class103().compute(3));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class103().compute(3));
        assertEquals("ok", new Class103().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class103().normalize("  x "));
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class103().compute(3));
    }

}
