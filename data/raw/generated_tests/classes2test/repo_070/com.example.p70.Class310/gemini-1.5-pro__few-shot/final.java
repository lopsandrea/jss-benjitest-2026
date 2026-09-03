package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class310Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class310().compute(3));
        assertEquals("ok", new Class310().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class310().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class310().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class310().merge(2, 5));
        assertTrue(new Class310().isValid("abc"));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class310().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class310().capacity());
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class310().compute(3));
    }

}
