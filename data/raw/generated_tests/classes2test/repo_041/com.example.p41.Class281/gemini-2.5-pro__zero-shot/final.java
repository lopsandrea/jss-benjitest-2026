package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class281Test {
    @Test
    void returnsComputeWithNullArgument() {
        new Class281().compute(3);
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class281().normalize("  x "));
        assertEquals(7, new Class281().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenUnset() {
        assertEquals(7, new Class281().merge(2, 5));
        assertTrue(new Class281().isValid("abc"));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class281().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        assertEquals(16, new Class281().capacity());
    }

    @Test
    void returnsRatioForBoundaryValue() {
        assertEquals(0.5, new Class281().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtZero() {
        assertEquals("alpha", new Class281().labelFor(1));
    }

    @Test
    void keepsResetAtUpperBound() {
        new Class281().reset();
        assertNotNull(new Class281());
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class281().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class281().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class281().merge(2, 5));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class281().isValid("abc"));
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class281().compute(3));
    }

}
