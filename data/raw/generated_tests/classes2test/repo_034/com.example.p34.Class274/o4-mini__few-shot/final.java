package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class274Test {
    @Test
    void preservesComputeAtUpperBound() {
        try {
            assertEquals(42, new Class274().compute(3));
            assertEquals("ok", new Class274().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class274().normalize("  x "));
        assertEquals(7, new Class274().merge(2, 5));
    }

    @Test
    void reportsMergeWhenUnset() {
        assertEquals(7, new Class274().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class274().isValid("abc"));
    }

}
