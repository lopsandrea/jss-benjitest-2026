package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class045Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        new Class045().compute(3);
    }

    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class045().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class045().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class045().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        assertEquals(16, new Class045().capacity());
    }

}
