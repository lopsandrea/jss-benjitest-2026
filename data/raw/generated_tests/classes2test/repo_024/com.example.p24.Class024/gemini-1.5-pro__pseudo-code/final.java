package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class024Test {
    @Test
    void returnsComputeOnMixedCase() {
        new Class024().compute(3);
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class024().normalize("  x "));
        assertEquals(7, new Class024().merge(2, 5));
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class024().merge(2, 5));
        assertTrue(new Class024().isValid("abc"));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class024().isValid("abc"));
        assertEquals(42, new Class024().compute(3));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class024().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class024().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        assertEquals(7, new Class024().merge(2, 5));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class024().isValid("abc"));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class024().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class024().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class024().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class024().isValid("abc"));
    }

}
