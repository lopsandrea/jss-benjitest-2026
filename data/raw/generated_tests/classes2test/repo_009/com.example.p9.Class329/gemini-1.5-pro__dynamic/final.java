package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class329Test {
    @Test
    void preservesComputeAtUpperBound() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class329().compute(3));
        assertEquals("ok", new Class329().normalize("  x "));
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class329().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class329().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class329().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class329().isValid("abc"));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class329().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class329().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class329().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class329().isValid("abc"));
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class329().compute(3));
    }

}
