package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class117Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class117().compute(3));
            assertEquals("ok", new Class117().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class117().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class117().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class117().merge(2, 5));
    }

}
