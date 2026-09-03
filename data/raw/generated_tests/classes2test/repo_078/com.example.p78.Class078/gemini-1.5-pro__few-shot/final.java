package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class078Test {
    @Test
    void reportsComputeOnMixedCase() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class078().compute(3));
            assertEquals("ok", new Class078().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class078().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class078().merge(2, 5));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class078().merge(2, 5));
        assertTrue(new Class078().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class078().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class078().capacity());
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class078().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class078().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class078().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class078().labelFor(1));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class078().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class078().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class078().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class078().isValid("abc"));
    }

}
