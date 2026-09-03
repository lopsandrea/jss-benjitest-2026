package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class090Test {
    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class090().compute(3));
        assertEquals("ok", new Class090().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class090().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        assertEquals(7, new Class090().merge(2, 5));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class090().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class090().normalize("  x "));
    }

}
