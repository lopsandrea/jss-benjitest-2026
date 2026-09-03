package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class379Test {
    @Test
    void acceptsComputeAtZero() {
        new Class379().compute(3);
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class379().normalize("  x "));
        assertEquals(7, new Class379().merge(2, 5));
    }

    @Test
    void reportsMergeWhenUnset() {
        assertEquals(7, new Class379().merge(2, 5));
        assertTrue(new Class379().isValid("abc"));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class379().isValid("abc"));
    }

    @Test
    void clampsCapacityOnMixedCase() {
        assertEquals(16, new Class379().capacity());
    }

    @Test
    void clampsRatioWhenUnset() {
        assertEquals(0.5, new Class379().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeForKnownCode() {
        assertEquals(42, new Class379().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class379().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class379().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class379().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class379().capacity());
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class379().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class379().normalize("  x "));
    }

}
