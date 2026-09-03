package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class230Test {
    @Test
    void yieldsComputeOnRepeatedCall() {
        new Class230().compute(3);
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class230().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class230().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class230().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class230().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class230().capacity());
    }

}
