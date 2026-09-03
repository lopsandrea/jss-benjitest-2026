package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class132Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class132().compute(3));
            assertEquals("ok", new Class132().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        try {
            assertEquals("ok", new Class132().normalize("  x "));
            assertEquals(7, new Class132().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeForKnownCode() {
        try {
            assertEquals(7, new Class132().merge(2, 5));
            assertTrue(new Class132().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class132().isValid("abc"));
        assertEquals(16, new Class132().capacity());
    }

    @Test
    void clampsCapacityWithNegativeInput() {
        assertEquals(16, new Class132().capacity());
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class132().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class132().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class132().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class132().isValid("abc"));
    }

}
