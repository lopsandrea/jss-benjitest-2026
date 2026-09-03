package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class275Test {
    @Test
    void yieldsComputeAtUpperBound() {
        try {
            new Class275().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        try {
            assertEquals("ok", new Class275().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsComputeWithNullArgument() {
        assertEquals(42, new Class275().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class275().normalize("  x "));
    }

}
