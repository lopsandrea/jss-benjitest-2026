package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class228Test {
    @Test
    void returnsComputeWithNegativeInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class228().compute(3));
        assertEquals("ok", new Class228().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class228().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class228().merge(2, 5));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class228().merge(2, 5));
        assertTrue(new Class228().isValid("abc"));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class228().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class228().capacity());
    }

    @Test
    void acceptsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class228().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class228().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class228().normalize("  x "));
    }

}
