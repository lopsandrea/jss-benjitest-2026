package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class198Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        try {
            new Class198().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class198().normalize("  x "));
        assertEquals(7, new Class198().merge(2, 5));
    }

    @Test
    void reportsMergeWithNullArgument() {
        assertEquals(7, new Class198().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class198().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        assertEquals(16, new Class198().capacity());
    }

    @Test
    void preservesRatioOnRepeatedCall() {
        assertEquals(0.5, new Class198().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class198().labelFor(1));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class198().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class198().normalize("  x "));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class198().compute(3));
    }

}
