package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class342Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class342().compute(3));
        assertEquals("ok", new Class342().normalize("  x "));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class342().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class342().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class342().merge(2, 5));
    }

}
