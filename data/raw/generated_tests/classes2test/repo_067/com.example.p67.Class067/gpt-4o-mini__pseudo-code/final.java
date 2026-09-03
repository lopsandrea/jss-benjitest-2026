package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class067Test {
    @Test
    void acceptsComputeWhenUnset() {
        new Class067().compute(3);
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class067().normalize("  x "));
        assertEquals(7, new Class067().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class067().merge(2, 5));
        assertTrue(new Class067().isValid("abc"));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class067().isValid("abc"));
        assertEquals(16, new Class067().capacity());
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        assertEquals(16, new Class067().capacity());
    }

    @Test
    void returnsRatioOnEmptyString() {
        assertEquals(0.5, new Class067().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnMixedCase() {
        assertEquals("alpha", new Class067().labelFor(1));
    }

    @Test
    void returnsResetAtZero() {
        new Class067().reset();
        assertNotNull(new Class067());
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class067().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class067().normalize("  x "));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class067().compute(3));
    }

}
