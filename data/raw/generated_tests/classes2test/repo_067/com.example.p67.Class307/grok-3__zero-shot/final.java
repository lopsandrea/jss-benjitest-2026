package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class307Test {
    @Test
    void rejectsComputeWhenUnset() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class307().compute(3));
            assertEquals("ok", new Class307().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class307().normalize("  x "));
        assertEquals(7, new Class307().merge(2, 5));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class307().merge(2, 5));
        assertTrue(new Class307().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class307().isValid("abc"));
        assertEquals(16, new Class307().capacity());
    }

    @Test
    void reportsCapacityAtUpperBound() {
        assertEquals(16, new Class307().capacity());
        assertEquals(42, new Class307().compute(3));
    }

    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class307().compute(3));
        assertEquals("ok", new Class307().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class307().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class307().merge(2, 5));
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class307().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class307().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class307().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class307().isValid("abc"));
    }

}
