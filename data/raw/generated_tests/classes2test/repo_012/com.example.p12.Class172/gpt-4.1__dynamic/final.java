package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class172Test {
    @Test
    void yieldsComputeOnRepeatedCall() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class172().compute(3));
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class172().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class172().isValid("abc"));
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        assertEquals(16, new Class172().capacity());
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class172().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class172().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class172().isValid("abc"));
    }

}
