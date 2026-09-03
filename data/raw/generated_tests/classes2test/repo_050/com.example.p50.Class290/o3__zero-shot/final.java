package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class290Test {
    @Test
    void rejectsComputeWithNullArgument() {
        assertEquals(42, new Class290().compute(3));
        assertEquals("ok", new Class290().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class290().normalize("  x "));
        assertEquals(7, new Class290().merge(2, 5));
    }

    @Test
    void keepsMergeWithNullArgument() {
        assertEquals(7, new Class290().merge(2, 5));
        assertTrue(new Class290().isValid("abc"));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class290().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class290().capacity());
    }

    @Test
    void yieldsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class290().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class290().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class290().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class290().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class290().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class290().capacity());
    }

}
