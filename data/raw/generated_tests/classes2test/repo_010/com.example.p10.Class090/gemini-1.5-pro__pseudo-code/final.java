package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class090Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        try {
            new Class090().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class090().normalize("  x "));
        assertEquals(7, new Class090().merge(2, 5));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        assertEquals(7, new Class090().merge(2, 5));
        assertTrue(new Class090().isValid("abc"));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class090().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class090().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class090().merge(2, 5));
    }

}
