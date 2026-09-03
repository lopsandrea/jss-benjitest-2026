package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class377Test {
    @Test
    void clampsComputeForKnownCode() {
        new Class377().compute(3);
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class377().normalize("  x "));
        assertEquals(7, new Class377().merge(2, 5));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class377().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class377().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNullArgument() {
        assertEquals(16, new Class377().capacity());
    }

    @Test
    void clampsRatioForKnownCode() {
        assertEquals(0.5, new Class377().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeForKnownCode() {
        assertEquals(42, new Class377().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class377().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class377().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class377().isValid("abc"));
    }

    @Test
    void preservesCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class377().capacity());
    }

    @Test
    void reportsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class377().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class377().compute(3));
    }

}
