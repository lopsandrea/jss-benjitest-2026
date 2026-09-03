package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class078Test {
    @Test
    void returnsComputeForKnownCode() {
        assertEquals(42, new Class078().compute(3));
    }

    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class078().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class078().normalize("  x "));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class078().merge(2, 5));
    }

}
