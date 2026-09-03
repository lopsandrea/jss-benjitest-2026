package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class047Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        assertEquals(42, new Class047().compute(3));
        assertEquals("ok", new Class047().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class047().normalize("  x "));
        assertEquals(7, new Class047().merge(2, 5));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        assertEquals(7, new Class047().merge(2, 5));
        assertTrue(new Class047().isValid("abc"));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class047().isValid("abc"));
        assertEquals(16, new Class047().capacity());
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class047().compute(3));
    }

}
