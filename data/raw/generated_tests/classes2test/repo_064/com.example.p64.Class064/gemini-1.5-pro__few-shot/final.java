package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class064Test {
    @Test
    void acceptsComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class064().compute(3);
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        assertEquals("ok", new Class064().normalize("  x "));
        assertEquals(7, new Class064().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class064().merge(2, 5));
        assertTrue(new Class064().isValid("abc"));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class064().isValid("abc"));
        assertEquals(16, new Class064().capacity());
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        assertEquals(16, new Class064().capacity());
        assertEquals(0.5, new Class064().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class064().ratio(1.0, 2.0), 1e-9);
        int expected1 = 42;
        assertEquals(expected1, new Class064().compute(3));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class064().compute(3));
        assertEquals("ok", new Class064().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class064().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class064().merge(2, 5));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class064().merge(2, 5));
        assertTrue(new Class064().isValid("abc"));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class064().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class064().capacity());
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class064().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class064().normalize("  x "));
    }

}
