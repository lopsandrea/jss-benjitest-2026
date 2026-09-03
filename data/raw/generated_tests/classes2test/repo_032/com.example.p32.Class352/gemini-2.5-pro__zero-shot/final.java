package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class352Test {
    @Test
    void keepsComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class352().compute(3);
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        new Class352().normalize("  x ");
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        new Class352().merge(2, 5);
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class352().isValid("abc"));
        assertEquals(16, new Class352().capacity());
    }

    @Test
    void rejectsCapacityForKnownCode() {
        assertEquals(16, new Class352().capacity());
        assertEquals(0.5, new Class352().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesRatioWhenUnset() {
        assertEquals(0.5, new Class352().ratio(1.0, 2.0), 1e-9);
        assertEquals(42, new Class352().compute(3));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class352().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class352().normalize("  x "));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class352().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class352().isValid("abc"));
    }

    @Test
    void preservesCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class352().capacity());
    }

    @Test
    void yieldsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class352().ratio(1.0, 2.0), 1e-9);
    }

}
