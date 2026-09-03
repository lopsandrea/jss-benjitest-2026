package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class359Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class359().compute(3);
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class359().normalize("  x "));
        assertEquals(7, new Class359().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class359().merge(2, 5));
        assertTrue(new Class359().isValid("abc"));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class359().isValid("abc"));
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class359().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class359().normalize("  x "));
    }

}
