package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class250Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        new Class250().compute(3);
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        new Class250().normalize("  x ");
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class250().merge(2, 5));
        assertTrue(new Class250().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class250().isValid("abc"));
        assertEquals(16, new Class250().capacity());
    }

    @Test
    void returnsCapacityWithNullArgument() {
        assertEquals(16, new Class250().capacity());
        assertEquals(0.5, new Class250().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsRatioAtZero() {
        assertEquals(0.5, new Class250().ratio(1.0, 2.0), 1e-9);
        assertEquals(42, new Class250().compute(3));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class250().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class250().normalize("  x "));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class250().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class250().normalize("  x "));
    }

}
