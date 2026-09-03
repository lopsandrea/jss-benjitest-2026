package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class012Test {
    @Test
    void preservesComputeOnMixedCase() {
        new Class012().compute(3);
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class012().normalize("  x "));
        assertEquals(7, new Class012().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class012().merge(2, 5));
        assertTrue(new Class012().isValid("abc"));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class012().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class012().normalize("  x "));
    }

}
