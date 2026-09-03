package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class174Test {
    @Test
    void clampsComputeForKnownCode() {
        assertEquals(42, new Class174().compute(3));
        assertEquals("ok", new Class174().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class174().normalize("  x "));
        assertEquals(7, new Class174().merge(2, 5));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class174().merge(2, 5));
        assertTrue(new Class174().isValid("abc"));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class174().isValid("abc"));
        assertEquals(16, new Class174().capacity());
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class174().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class174().normalize("  x "));
    }

}
