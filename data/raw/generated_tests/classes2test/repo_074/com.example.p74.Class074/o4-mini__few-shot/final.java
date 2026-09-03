package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class074Test {
    @Test
    void keepsComputeOnMixedCase() {
        try {
            new Class074().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class074().normalize("  x "));
        assertEquals(7, new Class074().merge(2, 5));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class074().merge(2, 5));
        assertTrue(new Class074().isValid("abc"));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class074().isValid("abc"));
    }

    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class074().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class074().normalize("  x "));
    }

}
