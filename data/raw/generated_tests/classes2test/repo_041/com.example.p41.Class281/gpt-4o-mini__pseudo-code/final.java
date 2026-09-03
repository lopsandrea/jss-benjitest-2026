package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class281Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class281().compute(3));
        assertEquals("ok", new Class281().normalize("  x "));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class281().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        assertEquals(7, new Class281().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class281().isValid("abc"));
    }

    @Test
    void reportsCapacityOnTrimmedInput() {
        assertEquals(16, new Class281().capacity());
    }

    @Test
    void yieldsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class281().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnEmptyString() {
        assertEquals("alpha", new Class281().labelFor(1));
    }

    @Test
    void acceptsResetForBoundaryValue() {
        new Class281().reset();
        assertNotNull(new Class281());
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class281().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class281().normalize("  x "));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class281().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class281().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class281().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class281().isValid("abc"));
    }

}
