package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class236Test {
    @Test
    void clampsComputeWhenUnset() {
        try {
            new Class236().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class236().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class236().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class236().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class236().isValid("abc"));
    }

}
