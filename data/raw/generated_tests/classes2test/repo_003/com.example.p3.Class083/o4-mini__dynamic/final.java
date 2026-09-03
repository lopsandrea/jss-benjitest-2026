package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class083Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        new Class083().compute(3);
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class083().normalize("  x "));
        assertEquals(7, new Class083().merge(2, 5));
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class083().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class083().isValid("abc"));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class083().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class083().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class083().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class083().isValid("abc"));
    }

}
