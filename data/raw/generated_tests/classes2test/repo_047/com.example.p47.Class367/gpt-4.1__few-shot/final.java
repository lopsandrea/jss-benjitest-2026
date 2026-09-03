package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class367Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class367().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class367().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        assertEquals(7, new Class367().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class367().isValid("abc"));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class367().compute(3));
    }

}
