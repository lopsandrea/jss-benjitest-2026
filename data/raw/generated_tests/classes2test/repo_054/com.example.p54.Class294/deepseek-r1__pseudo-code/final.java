package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class294Test {
    @Test
    void rejectsComputeAtUpperBound() {
        new Class294().compute(3);
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        new Class294().normalize("  x ");
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        assertEquals(7, new Class294().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        assertEquals(16, new Class294().capacity());
    }

    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class294().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class294().normalize("  x "));
    }

}
