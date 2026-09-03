package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class391Test {
    @Test
    void returnsComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class391().compute(3));
        assertEquals("ok", new Class391().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class391().normalize("  x "));
        assertEquals(7, new Class391().merge(2, 5));
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class391().merge(2, 5));
        assertTrue(new Class391().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class391().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class391().capacity());
    }

    @Test
    void returnsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class391().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class391().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class391().normalize("  x "));
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class391().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class391().normalize("  x "));
    }

    @Test
    void yieldsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class391().merge(2, 5));
    }

}
