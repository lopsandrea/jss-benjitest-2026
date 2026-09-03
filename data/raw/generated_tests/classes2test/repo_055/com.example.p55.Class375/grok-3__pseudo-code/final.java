package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class375Test {
    @Test
    void keepsComputeForKnownCode() {
        try {
            assertEquals(42, new Class375().compute(3));
            assertEquals("ok", new Class375().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class375().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class375().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class375().isValid("abc"));
    }

    @Test
    void rejectsCapacityForKnownCode() {
        assertEquals(16, new Class375().capacity());
    }

    @Test
    void reportsRatioWhenUnset() {
        assertEquals(0.5, new Class375().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class375().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class375().normalize("  x "));
    }

}
