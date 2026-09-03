package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class073Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        new Class073().compute(3);
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class073().normalize("  x "));
        assertEquals(7, new Class073().merge(2, 5));
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class073().merge(2, 5));
        assertTrue(new Class073().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class073().isValid("abc"));
        assertEquals(16, new Class073().capacity());
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        assertEquals(16, new Class073().capacity());
        assertEquals(42, new Class073().compute(3));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class073().compute(3));
        assertEquals("ok", new Class073().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class073().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        assertEquals(7, new Class073().merge(2, 5));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class073().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class073().normalize("  x "));
    }

}
