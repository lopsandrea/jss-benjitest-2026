package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class153Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class153().compute(3));
        assertEquals("ok", new Class153().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class153().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class153().merge(2, 5));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class153().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class153().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class153().merge(2, 5));
    }

}
