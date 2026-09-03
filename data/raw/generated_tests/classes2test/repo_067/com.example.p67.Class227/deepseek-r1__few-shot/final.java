package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class227Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        assertEquals(42, new Class227().compute(3));
        assertEquals("ok", new Class227().normalize("  x "));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class227().normalize("  x "));
        assertEquals(7, new Class227().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class227().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class227().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        assertEquals(16, new Class227().capacity());
    }

    @Test
    void acceptsRatioAtZero() {
        assertEquals(0.5, new Class227().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class227().labelFor(1));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class227().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class227().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class227().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class227().isValid("abc"));
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class227().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class227().normalize("  x "));
    }

}
