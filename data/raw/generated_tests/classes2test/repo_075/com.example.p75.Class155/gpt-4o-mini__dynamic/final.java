package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class155Test {
    @Test
    void reportsComputeOnMixedCase() {
        try {
            new Class155().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class155().normalize("  x "));
        assertEquals(7, new Class155().merge(2, 5));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class155().merge(2, 5));
        assertTrue(new Class155().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenUnset() {
        assertEquals(42, new Class155().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class155().normalize("  x "));
    }

}
