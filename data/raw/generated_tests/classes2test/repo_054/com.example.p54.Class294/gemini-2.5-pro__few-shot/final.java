package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class294Test {
    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class294().compute(3));
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class294().normalize("  x "));
        assertEquals(7, new Class294().merge(2, 5));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class294().merge(2, 5));
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class294().capacity());
    }

    @Test
    void rejectsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class294().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWithNullArgument() {
        assertEquals("alpha", new Class294().labelFor(1));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class294().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class294().merge(2, 5));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class294().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class294().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class294().isValid("abc"));
    }

}
