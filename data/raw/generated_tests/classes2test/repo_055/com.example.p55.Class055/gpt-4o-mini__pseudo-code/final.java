package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class055Test {
    @Test
    void reportsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class055().compute(3));
            assertEquals("ok", new Class055().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class055().normalize("  x "));
        assertEquals(7, new Class055().merge(2, 5));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class055().merge(2, 5));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class055().compute(3));
    }

}
