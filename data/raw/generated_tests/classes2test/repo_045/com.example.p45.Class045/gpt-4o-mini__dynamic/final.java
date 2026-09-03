package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class045Test {
    @Test
    void acceptsComputeAtUpperBound() {
        try {
            new Class045().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class045().normalize("  x "));
        assertEquals(7, new Class045().merge(2, 5));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class045().merge(2, 5));
        assertTrue(new Class045().isValid("abc"));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class045().isValid("abc"));
    }

    @Test
    void reportsCapacityOnTrimmedInput() {
        assertEquals(16, new Class045().capacity());
    }

    @Test
    void yieldsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class045().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class045().labelFor(1));
    }

    @Test
    void acceptsResetOnRepeatedCall() {
        new Class045().reset();
        assertNotNull(new Class045());
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class045().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class045().normalize("  x "));
    }

}
