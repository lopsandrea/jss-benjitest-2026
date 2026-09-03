package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class212Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        assertEquals(42, new Class212().compute(3));
        assertEquals("ok", new Class212().normalize("  x "));
    }

    @Test
    void yieldsComputeWhenUnset() {
        assertEquals(42, new Class212().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class212().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class212().merge(2, 5));
    }

}
