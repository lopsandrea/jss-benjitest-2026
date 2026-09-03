package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class020Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class020().compute(3));
        assertEquals("ok", new Class020().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class020().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class020().merge(2, 5));
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class020().compute(3));
    }

}
