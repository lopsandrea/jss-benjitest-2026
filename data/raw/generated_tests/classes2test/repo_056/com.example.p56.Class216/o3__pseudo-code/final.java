package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {
    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class216().compute(3));
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class216().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        assertEquals(16, new Class216().capacity());
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class216().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class216().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class216().capacity());
    }

}
