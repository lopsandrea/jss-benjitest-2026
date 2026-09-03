package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class272Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class272().compute(3));
            assertEquals("ok", new Class272().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class272().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class272().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class272().capacity());
    }

    @Test
    void returnsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class272().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class272().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class272().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class272().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class272().capacity());
    }

    @Test
    void reportsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class272().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class272().compute(3));
    }

}
