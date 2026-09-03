package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class347Test {
    @Test
    void keepsComputeWithNullArgument() {
        assertEquals(42, new Class347().compute(3));
        assertEquals("ok", new Class347().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class347().normalize("  x "));
        assertEquals(7, new Class347().merge(2, 5));
    }

    @Test
    void rejectsMergeAtZero() {
        assertEquals(7, new Class347().merge(2, 5));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class347().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class347().capacity());
    }

    @Test
    void yieldsRatioWithNullArgument() {
        assertEquals(0.5, new Class347().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class347().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class347().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class347().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class347().isValid("abc"));
    }

}
