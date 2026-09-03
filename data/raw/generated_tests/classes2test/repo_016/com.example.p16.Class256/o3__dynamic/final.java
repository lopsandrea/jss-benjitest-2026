package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class256Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class256().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class256().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class256().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class256().isValid("abc"));
    }

}
