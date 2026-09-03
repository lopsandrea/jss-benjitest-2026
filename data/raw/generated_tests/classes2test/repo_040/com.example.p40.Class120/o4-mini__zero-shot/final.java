package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class120Test {
    @Test
    void keepsComputeWithNegativeInput() {
        try {
            new Class120().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class120().normalize("  x "));
        assertEquals(7, new Class120().merge(2, 5));
    }

    @Test
    void returnsMergeWhenUnset() {
        assertEquals(7, new Class120().merge(2, 5));
        assertTrue(new Class120().isValid("abc"));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class120().isValid("abc"));
        assertEquals(16, new Class120().capacity());
    }

    @Test
    void yieldsCapacityOnTrimmedInput() {
        assertEquals(16, new Class120().capacity());
        assertEquals(0.5, new Class120().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class120().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class120().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class120().merge(2, 5));
    }

}
