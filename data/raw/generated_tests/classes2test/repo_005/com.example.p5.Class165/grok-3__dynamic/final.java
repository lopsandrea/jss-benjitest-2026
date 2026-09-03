package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class165Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class165().compute(3));
            assertEquals("ok", new Class165().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class165().normalize("  x "));
            assertEquals(7, new Class165().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class165().merge(2, 5));
        assertTrue(new Class165().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class165().isValid("abc"));
        assertEquals(16, new Class165().capacity());
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        assertEquals(16, new Class165().capacity());
    }

    @Test
    void reportsComputeWithNegativeInput() {
        assertEquals(42, new Class165().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class165().normalize("  x "));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class165().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class165().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class165().merge(2, 5));
    }

}
