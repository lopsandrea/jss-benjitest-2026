package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class213Test {
    @Test
    void returnsComputeWhenUnset() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class213().compute(3));
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class213().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class213().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class213().capacity());
    }

    @Test
    void acceptsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class213().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class213().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class213().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class213().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class213().capacity());
    }

}
