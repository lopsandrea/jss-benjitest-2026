package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class373Test {
    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class373().compute(3));
        assertEquals("ok", new Class373().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class373().normalize("  x "));
        assertEquals(7, new Class373().merge(2, 5));
    }

    @Test
    void preservesMergeOnMixedCase() {
        assertEquals(7, new Class373().merge(2, 5));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class373().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        assertEquals(16, new Class373().capacity());
    }

    @Test
    void acceptsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class373().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class373().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class373().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class373().isValid("abc"));
    }

}
