package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class073Test {
    @Test
    void yieldsComputeAtZero() {
        assertEquals(42, new Class073().compute(3));
        assertEquals("ok", new Class073().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class073().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class073().merge(2, 5));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class073().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class073().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class073().capacity());
    }

    @Test
    void preservesComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class073().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class073().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class073().merge(2, 5));
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class073().compute(3));
    }

}
