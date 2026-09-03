package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class290Test {
    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class290().compute(3));
        assertEquals("ok", new Class290().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class290().normalize("  x "));
    }

    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class290().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class290().normalize("  x "));
    }

}
