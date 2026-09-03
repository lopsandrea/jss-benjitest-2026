package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class265Test {
    @Test
    void returnsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class265().compute(3));
            assertEquals("ok", new Class265().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class265().normalize("  x "));
            assertEquals(7, new Class265().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class265().merge(2, 5));
        assertTrue(new Class265().isValid("abc"));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class265().isValid("abc"));
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        assertEquals(16, new Class265().capacity());
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class265().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class265().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class265().merge(2, 5));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class265().isValid("abc"));
    }

}
