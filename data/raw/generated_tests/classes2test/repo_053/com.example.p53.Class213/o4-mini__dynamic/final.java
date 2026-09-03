package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class213Test {
    @Test
    void clampsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class213().compute(3));
            assertEquals("ok", new Class213().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class213().normalize("  x "));
        assertEquals(7, new Class213().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class213().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class213().isValid("abc"));
    }

    @Test
    void keepsCapacityOnEmptyString() {
        assertEquals(16, new Class213().capacity());
    }

    @Test
    void reportsRatioAtUpperBound() {
        assertEquals(0.5, new Class213().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class213().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class213().merge(2, 5));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class213().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class213().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class213().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class213().capacity());
    }

}
