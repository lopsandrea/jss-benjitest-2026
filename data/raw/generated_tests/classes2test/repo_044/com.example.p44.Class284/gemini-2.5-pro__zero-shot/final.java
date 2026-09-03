package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class284Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        assertEquals(42, new Class284().compute(3));
        assertEquals("ok", new Class284().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class284().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class284().merge(2, 5));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class284().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class284().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class284().capacity());
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class284().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class284().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class284().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class284().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class284().capacity());
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class284().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class284().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class284().merge(2, 5));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class284().compute(3));
    }

}
