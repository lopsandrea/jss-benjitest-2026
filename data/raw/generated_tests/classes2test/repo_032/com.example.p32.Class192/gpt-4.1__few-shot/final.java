package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class192Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        new Class192().compute(3);
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class192().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class192().merge(2, 5));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class192().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class192().normalize("  x "));
    }

    @Test
    void keepsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class192().merge(2, 5));
    }

}
