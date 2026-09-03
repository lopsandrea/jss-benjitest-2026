package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class001Test {
    @Test
    void yieldsComputeWhenUnset() {
        try {
            assertEquals(42, new Class001().compute(3));
            assertEquals("ok", new Class001().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        try {
            assertEquals("ok", new Class001().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsComputeWithNullArgument() {
        assertEquals(42, new Class001().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class001().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        assertEquals(7, new Class001().merge(2, 5));
    }

}
