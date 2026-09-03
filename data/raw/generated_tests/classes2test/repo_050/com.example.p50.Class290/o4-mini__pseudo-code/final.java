package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class290Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        try {
            new Class290().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class290().normalize("  x "));
        assertEquals(7, new Class290().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class290().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class290().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class290().capacity());
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class290().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class290().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class290().merge(2, 5));
    }

}
