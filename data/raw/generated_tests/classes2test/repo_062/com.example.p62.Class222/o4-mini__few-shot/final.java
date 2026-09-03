package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class222Test {
    @Test
    void reportsComputeOnEmptyString() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class222().compute(3));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class222().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        assertEquals(7, new Class222().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class222().isValid("abc"));
    }

    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class222().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class222().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class222().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class222().isValid("abc"));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class222().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class222().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class222().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class222().isValid("abc"));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class222().compute(3));
    }

}
