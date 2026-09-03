package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class372Test {
    @Test
    void preservesComputeOnMixedCase() {
        new Class372().compute(3);
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class372().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class372().merge(2, 5));
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class372().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class372().normalize("  x "));
    }

}
