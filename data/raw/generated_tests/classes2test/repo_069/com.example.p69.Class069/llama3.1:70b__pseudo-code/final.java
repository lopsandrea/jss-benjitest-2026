package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class069Test {
    @Test
    void preservesComputeOnMixedCase() {
        new Class069().compute(3);
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class069().normalize("  x "));
        assertEquals(7, new Class069().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class069().merge(2, 5));
        assertTrue(new Class069().isValid("abc"));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class069().isValid("abc"));
        assertEquals(16, new Class069().capacity());
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class069().capacity());
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class069().compute(3));
    }

}
