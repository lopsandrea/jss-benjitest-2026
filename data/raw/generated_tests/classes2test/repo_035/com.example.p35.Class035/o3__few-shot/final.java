package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class035Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class035().compute(3));
        assertEquals("ok", new Class035().normalize("  x "));
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class035().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class035().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class035().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class035().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class035().capacity());
    }

    @Test
    void rejectsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class035().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForWithNullArgument() {
        assertEquals("alpha", new Class035().labelFor(1));
    }

}
