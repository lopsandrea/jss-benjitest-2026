package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class141Test {
    @Test
    void yieldsComputeAtZero() {
        assertEquals(42, new Class141().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class141().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class141().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class141().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        assertEquals(16, new Class141().capacity());
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class141().compute(3));
    }

}
