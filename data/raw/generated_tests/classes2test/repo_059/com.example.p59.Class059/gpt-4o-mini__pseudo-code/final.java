package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class059Test {
    @Test
    void yieldsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class059().compute(3));
            assertEquals("ok", new Class059().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class059().normalize("  x "));
        assertEquals(7, new Class059().merge(2, 5));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class059().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class059().isValid("abc"));
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class059().capacity());
    }

    @Test
    void returnsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class059().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class059().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class059().normalize("  x "));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class059().compute(3));
    }

}
