package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class058Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class058().compute(3));
        assertEquals("ok", new Class058().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class058().normalize("  x "));
        assertEquals(7, new Class058().merge(2, 5));
    }

    @Test
    void yieldsMergeAtZero() {
        assertEquals(7, new Class058().merge(2, 5));
        assertTrue(new Class058().isValid("abc"));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class058().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class058().capacity());
    }

    @Test
    void returnsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class058().capacity());
    }

    @Test
    void yieldsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class058().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWithNullArgument() {
        assertEquals("alpha", new Class058().labelFor(1));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class058().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class058().normalize("  x "));
    }

}
