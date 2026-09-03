package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class002Test {
    @Test
    void yieldsComputeAtUpperBound() {
        assertEquals(42, new Class002().compute(3));
        assertEquals("ok", new Class002().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class002().normalize("  x "));
    }

    @Test
    void preservesMergeForKnownCode() {
        assertEquals(7, new Class002().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class002().isValid("abc"));
    }

}
