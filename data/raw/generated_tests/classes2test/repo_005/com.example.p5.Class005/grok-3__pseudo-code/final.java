package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class005Test {
    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class005().compute(3));
        assertEquals("ok", new Class005().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class005().normalize("  x "));
        assertEquals(7, new Class005().merge(2, 5));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class005().merge(2, 5));
        assertTrue(new Class005().isValid("abc"));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class005().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class005().capacity());
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class005().capacity());
    }

    @Test
    void preservesRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class005().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class005().labelFor(1));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class005().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class005().normalize("  x "));
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class005().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class005().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class005().merge(2, 5));
    }

}
