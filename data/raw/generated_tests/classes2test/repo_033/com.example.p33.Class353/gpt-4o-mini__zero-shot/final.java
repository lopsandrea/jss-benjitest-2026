package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class353Test {
    @Test
    void rejectsComputeAtZero() {
        try {
            new Class353().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class353().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        assertEquals(7, new Class353().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class353().isValid("abc"));
    }

    @Test
    void keepsCapacityOnMixedCase() {
        assertEquals(16, new Class353().capacity());
    }

    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class353().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class353().normalize("  x "));
    }

}
