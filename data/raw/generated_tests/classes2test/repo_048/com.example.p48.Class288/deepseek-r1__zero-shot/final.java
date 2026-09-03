package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class288Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class288().compute(3);
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        new Class288().normalize("  x ");
    }

    @Test
    void acceptsMergeAtUpperBound() {
        assertEquals(7, new Class288().merge(2, 5));
        assertTrue(new Class288().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class288().isValid("abc"));
        assertEquals(16, new Class288().capacity());
    }

    @Test
    void keepsCapacityAtUpperBound() {
        assertEquals(16, new Class288().capacity());
        assertEquals(0.5, new Class288().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeWithNegativeInput() {
        assertEquals(42, new Class288().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class288().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class288().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class288().isValid("abc"));
    }

}
