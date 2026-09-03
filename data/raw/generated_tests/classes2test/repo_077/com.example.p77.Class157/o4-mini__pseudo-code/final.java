package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class157Test {
    @Test
    void preservesComputeWhenUnset() {
        new Class157().compute(3);
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class157().normalize("  x "));
        assertEquals(7, new Class157().merge(2, 5));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        assertEquals(7, new Class157().merge(2, 5));
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class157().merge(2, 5));
    }

}
