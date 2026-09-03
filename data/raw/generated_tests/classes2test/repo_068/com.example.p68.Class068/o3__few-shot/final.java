package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class068Test {
    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class068().compute(3));
        assertEquals("ok", new Class068().normalize("  x "));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class068().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class068().merge(2, 5));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class068().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class068().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class068().capacity());
    }

}
