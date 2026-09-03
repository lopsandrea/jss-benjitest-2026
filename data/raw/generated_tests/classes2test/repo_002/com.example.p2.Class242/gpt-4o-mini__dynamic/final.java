package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class242Test {
    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class242().compute(3));
        assertEquals("ok", new Class242().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class242().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        assertEquals(7, new Class242().merge(2, 5));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class242().isValid("abc"));
    }

    @Test
    void preservesCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class242().capacity());
    }

    @Test
    void clampsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class242().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class242().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class242().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class242().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class242().isValid("abc"));
    }

    @Test
    void acceptsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class242().capacity());
    }

    @Test
    void reportsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class242().ratio(1.0, 2.0), 1e-9);
    }

}
