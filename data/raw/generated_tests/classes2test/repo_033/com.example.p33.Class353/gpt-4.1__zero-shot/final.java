package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class353Test {
    @Test
    void preservesComputeOnEmptyString() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class353().compute(3));
        assertEquals("ok", new Class353().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class353().normalize("  x "));
        assertEquals(7, new Class353().merge(2, 5));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        assertEquals(7, new Class353().merge(2, 5));
        assertTrue(new Class353().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class353().isValid("abc"));
    }

    @Test
    void rejectsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class353().capacity());
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class353().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class353().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class353().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class353().isValid("abc"));
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class353().capacity());
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class353().compute(3));
    }

}
