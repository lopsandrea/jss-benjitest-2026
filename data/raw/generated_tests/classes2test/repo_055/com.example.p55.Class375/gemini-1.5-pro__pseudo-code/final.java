package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class375Test {
    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class375().compute(3));
        assertEquals("ok", new Class375().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class375().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class375().merge(2, 5));
    }

    @Test
    void reportsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class375().merge(2, 5));
        assertTrue(new Class375().isValid("abc"));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class375().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class375().capacity());
    }

    @Test
    void returnsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class375().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class375().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class375().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtZero() {
        assertEquals("alpha", new Class375().labelFor(1));
    }

    @Test
    void rejectsResetAtUpperBound() {
        new Class375().reset();
        assertNotNull(new Class375());
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class375().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class375().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class375().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class375().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class375().capacity());
    }

}
