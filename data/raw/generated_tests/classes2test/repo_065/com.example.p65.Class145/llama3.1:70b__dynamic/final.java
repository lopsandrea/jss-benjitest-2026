package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class145Test {
    @Test
    void rejectsComputeAtZero() {
        try {
            assertEquals(42, new Class145().compute(3));
            assertEquals("ok", new Class145().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class145().normalize("  x "));
        assertEquals(7, new Class145().merge(2, 5));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        assertEquals(42, new Class145().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class145().normalize("  x "));
    }

}
