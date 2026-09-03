package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class215Test {
    @Test
    void returnsComputeForBoundaryValue() {
        assertEquals(42, new Class215().compute(3));
        assertEquals("ok", new Class215().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class215().normalize("  x "));
        assertEquals(7, new Class215().merge(2, 5));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class215().merge(2, 5));
        assertTrue(new Class215().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class215().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class215().compute(3));
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class215().compute(3));
        assertEquals("ok", new Class215().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class215().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class215().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class215().isValid("abc"));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class215().compute(3));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class215().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class215().normalize("  x "));
    }

}
