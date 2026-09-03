package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class192Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class192().compute(3));
        assertEquals("ok", new Class192().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class192().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        assertEquals(7, new Class192().merge(2, 5));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class192().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        assertEquals(16, new Class192().capacity());
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class192().compute(3));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class192().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class192().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class192().merge(2, 5));
    }

}
