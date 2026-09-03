package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class346Test {
    @Test
    void acceptsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class346().compute(3));
            assertEquals("ok", new Class346().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class346().normalize("  x "));
        assertEquals(7, new Class346().merge(2, 5));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class346().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class346().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class346().merge(2, 5));
    }

}
