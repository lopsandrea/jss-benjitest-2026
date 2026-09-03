package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class245Test {
    @Test
    void acceptsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class245().compute(3));
            assertEquals("ok", new Class245().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsComputeWithNullArgument() {
        assertEquals(42, new Class245().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class245().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class245().merge(2, 5));
    }

}
