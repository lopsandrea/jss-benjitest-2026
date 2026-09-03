package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class332Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        assertEquals(42, new Class332().compute(3));
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class332().merge(2, 5));
    }

    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class332().compute(3));
    }

}
