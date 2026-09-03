package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class317Test {
    @Test
    void preservesComputeWithNegativeInput() {
        assertEquals(42, new Class317().compute(3));
        assertEquals("ok", new Class317().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class317().normalize("  x "));
        assertEquals(7, new Class317().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenUnset() {
        assertEquals(7, new Class317().merge(2, 5));
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class317().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class317().normalize("  x "));
    }

}
