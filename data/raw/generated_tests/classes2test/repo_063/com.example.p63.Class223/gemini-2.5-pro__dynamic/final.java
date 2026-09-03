package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class223Test {
    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class223().compute(3));
        assertEquals("ok", new Class223().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class223().normalize("  x "));
        assertEquals(7, new Class223().merge(2, 5));
    }

    @Test
    void acceptsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class223().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class223().normalize("  x "));
    }

}
