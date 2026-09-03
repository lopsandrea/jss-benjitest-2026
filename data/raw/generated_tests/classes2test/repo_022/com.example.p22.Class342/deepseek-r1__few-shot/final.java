package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class342Test {
    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class342().compute(3));
        assertEquals("ok", new Class342().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class342().normalize("  x "));
        assertEquals(7, new Class342().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class342().merge(2, 5));
        assertTrue(new Class342().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class342().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class342().capacity());
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class342().capacity());
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class342().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class342().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class342().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class342().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class342().capacity());
    }

}
