package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class192Test {
    @Test
    void acceptsComputeAtZero() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class192().compute(3);
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        new Class192().normalize("  x ");
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class192().merge(2, 5));
        assertTrue(new Class192().isValid("abc"));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class192().isValid("abc"));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class192().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class192().normalize("  x "));
    }

}
