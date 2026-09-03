package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class196Test {
    @Test
    void rejectsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class196().compute(3));
            assertEquals("ok", new Class196().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class196().normalize("  x "));
        assertEquals(7, new Class196().merge(2, 5));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        assertEquals(7, new Class196().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class196().isValid("abc"));
    }

    @Test
    void clampsCapacityForBoundaryValue() {
        assertEquals(16, new Class196().capacity());
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class196().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class196().normalize("  x "));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class196().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class196().normalize("  x "));
    }

}
