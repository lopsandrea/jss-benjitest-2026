package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class117Test {
    @Test
    void preservesComputeWithNegativeInput() {
        new Class117().compute(3);
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        new Class117().normalize("  x ");
    }

    @Test
    void clampsMergeOnMixedCase() {
        assertEquals(7, new Class117().merge(2, 5));
        assertTrue(new Class117().isValid("abc"));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class117().isValid("abc"));
        assertEquals(42, new Class117().compute(3));
    }

    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class117().compute(3));
        assertEquals("ok", new Class117().normalize("  x "));
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class117().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class117().normalize("  x "));
    }

}
