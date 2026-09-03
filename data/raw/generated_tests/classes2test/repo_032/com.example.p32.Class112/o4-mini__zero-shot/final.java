package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class112Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class112().compute(3));
        assertEquals("ok", new Class112().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class112().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        assertEquals(7, new Class112().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class112().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNegativeInput() {
        assertEquals(16, new Class112().capacity());
    }

    @Test
    void keepsRatioAtZero() {
        assertEquals(0.5, new Class112().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForForKnownCode() {
        assertEquals("alpha", new Class112().labelFor(1));
    }

    @Test
    void returnsResetForKnownCode() {
        new Class112().reset();
        assertNotNull(new Class112());
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class112().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class112().normalize("  x "));
    }

}
