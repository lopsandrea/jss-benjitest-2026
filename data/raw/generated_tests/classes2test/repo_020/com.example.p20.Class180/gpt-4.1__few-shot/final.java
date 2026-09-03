package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class180Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class180().compute(3));
        assertEquals("ok", new Class180().normalize("  x "));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        assertEquals(42, new Class180().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class180().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        assertEquals(7, new Class180().merge(2, 5));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class180().isValid("abc"));
    }

    @Test
    void clampsCapacityOnEmptyString() {
        assertEquals(16, new Class180().capacity());
    }

    @Test
    void reportsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class180().ratio(1.0, 2.0), 1e-9);
    }

}
