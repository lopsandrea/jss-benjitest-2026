package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class296Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class296().compute(3));
        assertEquals("ok", new Class296().normalize("  x "));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class296().normalize("  x "));
        assertEquals(7, new Class296().merge(2, 5));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class296().merge(2, 5));
        assertTrue(new Class296().isValid("abc"));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class296().isValid("abc"));
        assertEquals(16, new Class296().capacity());
    }

    @Test
    void clampsCapacityWithNullArgument() {
        assertEquals(16, new Class296().capacity());
    }

}
