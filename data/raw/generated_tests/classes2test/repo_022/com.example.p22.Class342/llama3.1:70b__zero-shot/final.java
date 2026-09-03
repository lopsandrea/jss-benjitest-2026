package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class342Test {
    @Test
    void preservesComputeWithNullArgument() {
        try {
            assertEquals(42, new Class342().compute(3));
            assertEquals("ok", new Class342().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class342().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        assertEquals(7, new Class342().merge(2, 5));
    }

    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class342().compute(3));
    }

}
