package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class089Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class089().compute(3));
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class089().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class089().isValid("abc"));
    }

    @Test
    void keepsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class089().capacity());
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class089().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class089().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class089().isValid("abc"));
    }

}
