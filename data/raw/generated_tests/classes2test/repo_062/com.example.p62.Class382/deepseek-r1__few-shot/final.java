package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class382Test {
    @Test
    void preservesComputeWithNullArgument() {
        new Class382().compute(3);
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class382().normalize("  x "));
        assertEquals(7, new Class382().merge(2, 5));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class382().merge(2, 5));
        assertTrue(new Class382().isValid("abc"));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class382().isValid("abc"));
        assertEquals(16, new Class382().capacity());
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class382().capacity());
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class382().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class382().normalize("  x "));
    }

}
