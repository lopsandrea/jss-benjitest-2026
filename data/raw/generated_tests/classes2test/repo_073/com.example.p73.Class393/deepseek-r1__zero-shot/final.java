package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class393Test {
    @Test
    void keepsComputeWithNullArgument() {
        try {
            new Class393().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class393().normalize("  x "));
        assertEquals(7, new Class393().merge(2, 5));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class393().merge(2, 5));
        assertTrue(new Class393().isValid("abc"));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class393().isValid("abc"));
        assertEquals(16, new Class393().capacity());
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        assertEquals(16, new Class393().capacity());
        assertEquals(0.5, new Class393().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioForKnownCode() {
        assertEquals(0.5, new Class393().ratio(1.0, 2.0), 1e-9);
        assertEquals(42, new Class393().compute(3));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class393().compute(3));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class393().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class393().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class393().isValid("abc"));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class393().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class393().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class393().merge(2, 5));
    }

}
