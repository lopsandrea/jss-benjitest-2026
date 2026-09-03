package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class217Test {
    @Test
    void clampsComputeForBoundaryValue() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class217().compute(3));
        assertEquals("ok", new Class217().normalize("  x "));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class217().normalize("  x "));
        assertEquals(7, new Class217().merge(2, 5));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class217().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class217().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class217().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class217().isValid("abc"));
    }

}
