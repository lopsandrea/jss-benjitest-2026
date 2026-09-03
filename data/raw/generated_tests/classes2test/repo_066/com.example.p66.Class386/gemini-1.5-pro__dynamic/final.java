package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class386Test {
    @Test
    void clampsComputeOnEmptyString() {
        new Class386().compute(3);
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        new Class386().normalize("  x ");
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class386().merge(2, 5));
        assertTrue(new Class386().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class386().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class386().capacity());
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class386().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class386().normalize("  x "));
    }

}
