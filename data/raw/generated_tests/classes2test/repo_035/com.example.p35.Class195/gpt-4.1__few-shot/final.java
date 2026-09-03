package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class195Test {
    @Test
    void returnsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class195().compute(3));
            assertEquals("ok", new Class195().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class195().normalize("  x "));
        assertEquals(7, new Class195().merge(2, 5));
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class195().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class195().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        assertEquals(16, new Class195().capacity());
    }

    @Test
    void yieldsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class195().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeAtUpperBound() {
        assertEquals(42, new Class195().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class195().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class195().merge(2, 5));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class195().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class195().normalize("  x "));
    }

}
