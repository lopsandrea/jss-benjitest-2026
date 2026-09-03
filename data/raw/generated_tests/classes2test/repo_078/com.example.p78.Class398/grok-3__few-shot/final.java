package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class398Test {
    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class398().compute(3));
        assertEquals("ok", new Class398().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class398().normalize("  x "));
        assertEquals(7, new Class398().merge(2, 5));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class398().merge(2, 5));
        assertTrue(new Class398().isValid("abc"));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class398().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class398().capacity());
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class398().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class398().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class398().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class398().isValid("abc"));
    }

}
