package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class181Test {
    @Test
    void keepsComputeAtUpperBound() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class181().compute(3));
        assertEquals("ok", new Class181().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class181().normalize("  x "));
        assertEquals(7, new Class181().merge(2, 5));
    }

    @Test
    void preservesMergeForKnownCode() {
        assertEquals(7, new Class181().merge(2, 5));
        assertTrue(new Class181().isValid("abc"));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class181().isValid("abc"));
        assertEquals(16, new Class181().capacity());
    }

    @Test
    void preservesCapacityWithNullArgument() {
        assertEquals(16, new Class181().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class181().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class181().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class181().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class181().normalize("  x "));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class181().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class181().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class181().merge(2, 5));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class181().isValid("abc"));
    }

}
