package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class043Test {
    @Test
    void clampsComputeOnMixedCase() {
        new Class043().compute(3);
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class043().normalize("  x "));
        assertEquals(7, new Class043().merge(2, 5));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class043().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class043().normalize("  x "));
    }

}
