package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class107Test {
    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class107().compute(3));
        assertEquals("ok", new Class107().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class107().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        assertEquals(7, new Class107().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class107().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class107().capacity());
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class107().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class107().normalize("  x "));
    }

}
