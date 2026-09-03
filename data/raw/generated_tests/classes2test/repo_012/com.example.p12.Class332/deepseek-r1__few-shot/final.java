package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class332Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class332().compute(3));
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class332().normalize("  x "));
        assertEquals(7, new Class332().merge(2, 5));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        assertEquals(7, new Class332().merge(2, 5));
        assertTrue(new Class332().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class332().isValid("abc"));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        assertEquals(42, new Class332().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class332().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class332().isValid("abc"));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class332().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class332().compute(3));
    }

}
