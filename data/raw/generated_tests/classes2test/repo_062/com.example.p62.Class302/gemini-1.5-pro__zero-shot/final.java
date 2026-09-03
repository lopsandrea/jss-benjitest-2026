package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class302Test {
    @Test
    void returnsComputeForBoundaryValue() {
        try {
            new Class302().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class302().normalize("  x "));
        assertEquals(7, new Class302().merge(2, 5));
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class302().merge(2, 5));
        assertTrue(new Class302().isValid("abc"));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class302().isValid("abc"));
        assertEquals(16, new Class302().capacity());
    }

    @Test
    void yieldsCapacityOnTrimmedInput() {
        assertEquals(16, new Class302().capacity());
        assertEquals(42, new Class302().compute(3));
    }

    @Test
    void keepsComputeWithNullArgument() {
        assertEquals(42, new Class302().compute(3));
        assertEquals("ok", new Class302().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class302().normalize("  x "));
    }

    @Test
    void preservesComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class302().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class302().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class302().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class302().isValid("abc"));
    }

}
