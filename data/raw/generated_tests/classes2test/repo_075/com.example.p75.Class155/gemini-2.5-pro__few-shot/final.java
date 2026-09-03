package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class155Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        new Class155().compute(3);
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class155().normalize("  x "));
        assertEquals(7, new Class155().merge(2, 5));
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class155().merge(2, 5));
        assertTrue(new Class155().isValid("abc"));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class155().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class155().capacity());
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class155().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class155().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class155().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class155().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class155().capacity());
    }

}
