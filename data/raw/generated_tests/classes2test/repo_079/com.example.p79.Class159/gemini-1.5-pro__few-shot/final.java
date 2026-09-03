package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class159Test {
    @Test
    void reportsComputeOnMixedCase() {
        assertEquals(42, new Class159().compute(3));
        assertEquals("ok", new Class159().normalize("  x "));
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class159().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class159().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class159().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class159().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class159().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class159().normalize("  x "));
    }

}
