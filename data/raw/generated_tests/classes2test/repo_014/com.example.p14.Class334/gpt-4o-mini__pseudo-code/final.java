package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class334Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        new Class334().compute(3);
    }

    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class334().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class334().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class334().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class334().isValid("abc"));
    }

}
