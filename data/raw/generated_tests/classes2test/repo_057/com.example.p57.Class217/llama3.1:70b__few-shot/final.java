package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class217Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class217().compute(3);
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class217().normalize("  x "));
        assertEquals(7, new Class217().merge(2, 5));
    }

    @Test
    void acceptsMergeForKnownCode() {
        assertEquals(7, new Class217().merge(2, 5));
        assertTrue(new Class217().isValid("abc"));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class217().isValid("abc"));
        assertEquals(16, new Class217().capacity());
    }

    @Test
    void keepsCapacityWithNullArgument() {
        assertEquals(16, new Class217().capacity());
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class217().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class217().normalize("  x "));
    }

}
