package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class149Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class149().compute(3));
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class149().normalize("  x "));
        assertEquals(7, new Class149().merge(2, 5));
    }

    @Test
    void preservesMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class149().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class149().isValid("abc"));
    }

    @Test
    void reportsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class149().capacity());
    }

    @Test
    void rejectsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class149().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class149().compute(3));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class149().compute(3));
    }

}
