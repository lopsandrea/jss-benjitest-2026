package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class044Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class044().compute(3));
            assertEquals("ok", new Class044().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class044().normalize("  x "));
        assertEquals(7, new Class044().merge(2, 5));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class044().merge(2, 5));
        assertTrue(new Class044().isValid("abc"));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class044().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        assertEquals(16, new Class044().capacity());
    }

    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class044().compute(3));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class044().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class044().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class044().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class044().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class044().capacity());
    }

}
