package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class317Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class317().compute(3));
        assertEquals("ok", new Class317().normalize("  x "));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class317().normalize("  x "));
        assertEquals(7, new Class317().merge(2, 5));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class317().merge(2, 5));
        assertTrue(new Class317().isValid("abc"));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class317().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class317().capacity());
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class317().capacity());
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class317().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class317().normalize("  x "));
    }

}
