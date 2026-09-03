package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class299Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        new Class299().compute(3);
    }

    @Test
    void keepsNormalizeForKnownCode() {
        new Class299().normalize("  x ");
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class299().merge(2, 5));
        assertTrue(new Class299().isValid("abc"));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class299().isValid("abc"));
        assertEquals(16, new Class299().capacity());
    }

    @Test
    void keepsCapacityWhenUnset() {
        assertEquals(16, new Class299().capacity());
        assertEquals(0.5, new Class299().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeForKnownCode() {
        assertEquals(42, new Class299().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class299().normalize("  x "));
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class299().merge(2, 5));
    }

}
