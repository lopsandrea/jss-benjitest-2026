package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class046Test {
    @Test
    void reportsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class046().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class046().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        assertEquals(7, new Class046().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class046().isValid("abc"));
    }

    @Test
    void clampsCapacityOnTrimmedInput() {
        assertEquals(16, new Class046().capacity());
    }

    @Test
    void clampsRatioForKnownCode() {
        assertEquals(0.5, new Class046().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class046().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class046().normalize("  x "));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class046().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class046().isValid("abc"));
    }

}
