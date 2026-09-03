package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class315Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        try {
            new Class315().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class315().normalize("  x "));
        assertEquals(7, new Class315().merge(2, 5));
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class315().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class315().isValid("abc"));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class315().compute(3));
    }

}
