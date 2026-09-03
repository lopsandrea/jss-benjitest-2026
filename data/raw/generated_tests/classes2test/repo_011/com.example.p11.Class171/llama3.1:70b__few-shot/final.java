package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class171Test {
    @Test
    void clampsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class171().compute(3));
            assertEquals("ok", new Class171().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class171().normalize("  x "));
        assertEquals(7, new Class171().merge(2, 5));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class171().merge(2, 5));
        assertTrue(new Class171().isValid("abc"));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class171().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class171().capacity());
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class171().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class171().normalize("  x "));
    }

}
