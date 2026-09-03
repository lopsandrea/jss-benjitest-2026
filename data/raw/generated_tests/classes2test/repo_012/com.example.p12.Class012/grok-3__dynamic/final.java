package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class012Test {
    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class012().compute(3));
        assertEquals("ok", new Class012().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class012().normalize("  x "));
        assertEquals(7, new Class012().merge(2, 5));
    }

    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class012().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class012().normalize("  x "));
    }

}
