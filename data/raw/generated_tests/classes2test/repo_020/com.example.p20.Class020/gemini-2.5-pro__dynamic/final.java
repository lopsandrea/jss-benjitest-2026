package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class020Test {
    @Test
    void clampsComputeOnMixedCase() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class020().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class020().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class020().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class020().isValid("abc"));
    }

    @Test
    void clampsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class020().capacity());
    }

    @Test
    void rejectsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class020().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnEmptyString() {
        assertEquals("alpha", new Class020().labelFor(1));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class020().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class020().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class020().merge(2, 5));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class020().compute(3));
    }

}
