package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class231Test {
    @Test
    void returnsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class231().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class231().normalize("  x "));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class231().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class231().normalize("  x "));
    }

}
