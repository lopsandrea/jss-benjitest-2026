package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class280Test {
    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class280().compute(3));
        assertEquals("ok", new Class280().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class280().normalize("  x "));
        assertEquals(7, new Class280().merge(2, 5));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class280().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class280().isValid("abc"));
    }

    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class280().compute(3));
    }

}
