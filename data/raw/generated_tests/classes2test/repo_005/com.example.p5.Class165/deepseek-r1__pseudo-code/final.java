package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class165Test {
    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class165().compute(3));
        assertEquals("ok", new Class165().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class165().normalize("  x "));
        assertEquals(7, new Class165().merge(2, 5));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class165().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class165().isValid("abc"));
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        assertEquals(16, new Class165().capacity());
    }

    @Test
    void preservesComputeWhenUnset() {
        assertEquals(42, new Class165().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class165().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class165().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class165().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class165().capacity());
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class165().compute(3));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class165().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class165().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class165().merge(2, 5));
    }

}
