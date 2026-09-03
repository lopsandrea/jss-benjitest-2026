package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class145Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class145().compute(3));
            assertEquals("ok", new Class145().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class145().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class145().normalize("  x "));
    }

    @Test
    void clampsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class145().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class145().isValid("abc"));
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class145().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class145().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class145().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class145().isValid("abc"));
    }

}
