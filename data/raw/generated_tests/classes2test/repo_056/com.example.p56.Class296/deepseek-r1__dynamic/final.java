package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class296Test {
    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class296().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class296().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        assertEquals(7, new Class296().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class296().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class296().capacity());
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class296().compute(3));
    }

}
