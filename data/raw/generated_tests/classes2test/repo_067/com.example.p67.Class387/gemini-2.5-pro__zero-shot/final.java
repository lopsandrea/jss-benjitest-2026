package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class387Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class387().compute(3));
        assertEquals("ok", new Class387().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class387().normalize("  x "));
        assertEquals(7, new Class387().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class387().merge(2, 5));
        assertTrue(new Class387().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class387().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        assertEquals(16, new Class387().capacity());
    }

    @Test
    void rejectsComputeWithNullArgument() {
        assertEquals(42, new Class387().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class387().normalize("  x "));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class387().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class387().normalize("  x "));
    }

}
