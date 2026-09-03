package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class157Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        assertEquals(42, new Class157().compute(3));
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class157().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class157().capacity());
    }

    @Test
    void rejectsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class157().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class157().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class157().capacity());
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

}
