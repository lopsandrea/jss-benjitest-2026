package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class237Test {
    @Test
    void yieldsComputeAtUpperBound() {
        try {
            new Class237().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class237().normalize("  x "));
        assertEquals(7, new Class237().merge(2, 5));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class237().merge(2, 5));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class237().isValid("abc"));
    }

    @Test
    void preservesCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class237().capacity());
    }

    @Test
    void returnsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class237().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnMixedCase() {
        assertEquals("alpha", new Class237().labelFor(1));
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class237().compute(3));
    }

    @Test
    void acceptsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class237().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class237().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class237().isValid("abc"));
    }

}
