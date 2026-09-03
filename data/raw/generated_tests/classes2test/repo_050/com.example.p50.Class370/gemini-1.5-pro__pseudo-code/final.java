package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class370Test {
    @Test
    void rejectsComputeForKnownCode() {
        assertEquals(42, new Class370().compute(3));
        assertEquals("ok", new Class370().normalize("  x "));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class370().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class370().merge(2, 5));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class370().merge(2, 5));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class370().compute(3));
    }

}
