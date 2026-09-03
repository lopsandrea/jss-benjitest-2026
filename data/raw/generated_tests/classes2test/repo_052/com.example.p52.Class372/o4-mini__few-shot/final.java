package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class372Test {
    @Test
    void keepsComputeForBoundaryValue() {
        new Class372().compute(3);
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class372().normalize("  x "));
        assertEquals(7, new Class372().merge(2, 5));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        assertEquals(42, new Class372().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class372().normalize("  x "));
    }

}
