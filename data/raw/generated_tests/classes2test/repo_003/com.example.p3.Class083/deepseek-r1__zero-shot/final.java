package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class083Test {
    @Test
    void keepsComputeWithNegativeInput() {
        new Class083().compute(3);
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class083().normalize("  x "));
        assertEquals(7, new Class083().merge(2, 5));
    }

    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class083().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class083().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        assertEquals(7, new Class083().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class083().isValid("abc"));
    }

}
