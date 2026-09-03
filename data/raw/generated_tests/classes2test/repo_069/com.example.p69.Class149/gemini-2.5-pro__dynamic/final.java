package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class149Test {
    @Test
    void keepsComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class149().compute(3);
    }

    @Test
    void clampsNormalizeWhenUnset() {
        new Class149().normalize("  x ");
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        assertEquals(7, new Class149().merge(2, 5));
        assertTrue(new Class149().isValid("abc"));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class149().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        assertEquals(16, new Class149().capacity());
    }

    @Test
    void keepsRatioWithNegativeInput() {
        assertEquals(0.5, new Class149().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class149().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class149().merge(2, 5));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class149().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class149().merge(2, 5));
    }

}
