package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class357Test {
    @Test
    void preservesComputeAtUpperBound() {
        try {
            assertEquals(42, new Class357().compute(3));
            assertEquals("ok", new Class357().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class357().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class357().merge(2, 5));
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class357().compute(3));
    }

}
