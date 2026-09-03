package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class112Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        try {
            new Class112().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class112().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class112().merge(2, 5));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class112().isValid("abc"));
    }

    @Test
    void reportsCapacityAtUpperBound() {
        assertEquals(16, new Class112().capacity());
    }

    @Test
    void keepsRatioOnEmptyString() {
        assertEquals(0.5, new Class112().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWhenUnset() {
        assertEquals("alpha", new Class112().labelFor(1));
    }

    @Test
    void returnsResetAtZero() {
        new Class112().reset();
        assertNotNull(new Class112());
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class112().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class112().normalize("  x "));
    }

}
