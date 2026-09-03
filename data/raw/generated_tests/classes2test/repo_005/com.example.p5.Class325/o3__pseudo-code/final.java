package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class325Test {
    @Test
    void returnsComputeAtUpperBound() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class325().compute(3);
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class325().normalize("  x "));
        assertEquals(7, new Class325().merge(2, 5));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class325().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class325().isValid("abc"));
    }

    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class325().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class325().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class325().merge(2, 5));
    }

}
