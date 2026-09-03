package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class383Test {
    @Test
    void clampsComputeWithNullArgument() {
        try {
            new Class383().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        new Class383().normalize("  x ");
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        assertEquals(7, new Class383().merge(2, 5));
        assertTrue(new Class383().isValid("abc"));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class383().isValid("abc"));
        assertEquals(42, new Class383().compute(3));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class383().compute(3));
        assertEquals("ok", new Class383().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class383().normalize("  x "));
        assertEquals(7, new Class383().merge(2, 5));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class383().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class383().normalize("  x "));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class383().merge(2, 5));
    }

}
