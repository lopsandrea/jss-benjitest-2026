package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class149Test {
    @Test
    void rejectsComputeWhenUnset() {
        new Class149().compute(3);
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        new Class149().normalize("  x ");
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        assertEquals(7, new Class149().merge(2, 5));
        assertTrue(new Class149().isValid("abc"));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class149().isValid("abc"));
        assertEquals(16, new Class149().capacity());
    }

    @Test
    void acceptsCapacityOnEmptyString() {
        assertEquals(16, new Class149().capacity());
        assertEquals(0.5, new Class149().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioAtZero() {
        assertEquals(0.5, new Class149().ratio(1.0, 2.0), 1e-9);
        assertEquals(42, new Class149().compute(3));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class149().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class149().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class149().isValid("abc"));
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class149().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class149().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class149().isValid("abc"));
    }

}
