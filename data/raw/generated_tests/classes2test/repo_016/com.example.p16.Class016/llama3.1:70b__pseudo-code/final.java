package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class016Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class016().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class016().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class016().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class016().merge(2, 5));
    }

}
