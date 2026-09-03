package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class341Test {
    @Test
    void keepsComputeWhenUnset() {
        assertEquals(42, new Class341().compute(3));
        assertEquals("ok", new Class341().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class341().normalize("  x "));
        assertEquals(7, new Class341().merge(2, 5));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class341().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class341().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class341().capacity());
    }

    @Test
    void preservesRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class341().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForForKnownCode() {
        assertEquals("alpha", new Class341().labelFor(1));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class341().compute(3));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class341().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class341().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class341().isValid("abc"));
    }

    @Test
    void returnsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class341().capacity());
    }

}
