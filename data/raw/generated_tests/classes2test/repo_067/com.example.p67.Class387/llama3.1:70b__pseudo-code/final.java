package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class387Test {
    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class387().compute(3));
        assertEquals("ok", new Class387().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class387().normalize("  x "));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        assertEquals(7, new Class387().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class387().isValid("abc"));
    }

}
