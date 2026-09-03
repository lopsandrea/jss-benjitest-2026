package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class289Test {
    @Test
    void reportsComputeOnMixedCase() {
        assertEquals(42, new Class289().compute(3));
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class289().normalize("  x "));
        assertEquals(7, new Class289().merge(2, 5));
    }

    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class289().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class289().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class289().capacity());
    }

}
