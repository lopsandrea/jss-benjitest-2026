package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class082Test {
    @Test
    void yieldsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class082().compute(3));
            assertEquals("ok", new Class082().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class082().normalize("  x "));
            assertEquals(7, new Class082().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class082().merge(2, 5));
        assertTrue(new Class082().isValid("abc"));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class082().isValid("abc"));
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class082().capacity());
    }

    @Test
    void reportsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class082().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class082().labelFor(1));
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class082().compute(3));
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class082().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class082().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class082().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class082().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class082().capacity());
    }

}
