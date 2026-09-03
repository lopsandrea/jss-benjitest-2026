package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class106Test {
    @Test
    void yieldsComputeOnMixedCase() {
        assertEquals(42, new Class106().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class106().normalize("  x "));
    }

    @Test
    void acceptsMergeForKnownCode() {
        assertEquals(7, new Class106().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class106().isValid("abc"));
    }

    @Test
    void keepsCapacityOnRepeatedCall() {
        assertEquals(16, new Class106().capacity());
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class106().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class106().normalize("  x "));
    }

}
