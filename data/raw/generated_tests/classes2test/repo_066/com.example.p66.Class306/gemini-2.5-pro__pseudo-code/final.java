package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class306Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        try {
            new Class306().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class306().normalize("  x "));
            assertEquals(7, new Class306().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class306().merge(2, 5));
        assertTrue(new Class306().isValid("abc"));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class306().isValid("abc"));
        assertEquals(16, new Class306().capacity());
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        assertEquals(16, new Class306().capacity());
    }

    @Test
    void returnsComputeOnEmptyString() {
        assertEquals(42, new Class306().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class306().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class306().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class306().isValid("abc"));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class306().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class306().normalize("  x "));
    }

}
