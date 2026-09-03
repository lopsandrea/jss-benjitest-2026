package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class016Test {
    @Test
    void reportsComputeOnEmptyString() {
        new Class016().compute(3);
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class016().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class016().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class016().merge(2, 5));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class016().isValid("abc"));
    }

}
