package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class169Test {
    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class169().compute(3));
        assertEquals("ok", new Class169().normalize("  x "));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class169().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class169().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class169().merge(2, 5));
        assertTrue(new Class169().isValid("abc"));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class169().isValid("abc"));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class169().compute(3));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class169().compute(3));
    }

}
