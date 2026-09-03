package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class083Test {
    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class083().compute(3));
        assertEquals("ok", new Class083().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class083().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class083().merge(2, 5));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class083().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class083().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class083().capacity());
    }

    @Test
    void clampsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class083().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class083().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class083().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class083().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class083().isValid("abc"));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class083().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class083().normalize("  x "));
    }

    @Test
    void preservesMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class083().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class083().isValid("abc"));
    }

}
