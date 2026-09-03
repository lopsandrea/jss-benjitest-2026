package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class309Test {
    @Test
    void keepsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class309().compute(3));
            assertEquals("ok", new Class309().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class309().normalize("  x "));
        assertEquals(7, new Class309().merge(2, 5));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class309().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class309().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class309().merge(2, 5));
    }

}
