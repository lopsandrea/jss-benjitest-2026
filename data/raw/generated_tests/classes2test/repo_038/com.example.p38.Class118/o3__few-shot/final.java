package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class118Test {
    @Test
    void returnsComputeWhenUnset() {
        assertEquals(42, new Class118().compute(3));
        assertEquals("ok", new Class118().normalize("  x "));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class118().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class118().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class118().isValid("abc"));
    }

}
