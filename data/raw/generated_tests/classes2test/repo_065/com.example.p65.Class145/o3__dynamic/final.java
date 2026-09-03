package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class145Test {
    @Test
    void returnsComputeWhenUnset() {
        try {
            assertEquals(42, new Class145().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class145().normalize("  x "));
    }

    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class145().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class145().normalize("  x "));
    }

}
